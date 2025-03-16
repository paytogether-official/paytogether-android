package com.payto.feature.createjourney.countrydialog

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.Stable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.distinctUntilChanged
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.onEach

@Composable
fun rememberCountrySelectionState(
): CountrySelectionState {
    val coroutineScope = rememberCoroutineScope()
    return remember {
        CountrySelectionImpl(coroutineScope)
    }
}

@Stable
interface CountrySelectionState {
    val filterState: FilterState
    val countries: List<Country>
    val continent: List<Continent?>
    fun updateContinent(continent: Continent?)
    fun updateQuery(query: String = "")
}

@Stable
private class CountrySelectionImpl(
    private val coroutineScope: CoroutineScope
) : CountrySelectionState {

    constructor(filterState: FilterState) : this(coroutineScope = CoroutineScope(Dispatchers.Default)) {
        _filterState.value = filterState
    }

    private val allCountries = Country.entries.toList()

    override val continent: List<Continent?> =
        mutableListOf<Continent?>(null).apply {
            addAll(Continent.entries)
        }

    private val _filterState = MutableStateFlow(FilterState())
    override val filterState get() = _filterState.value

    private val _countries: MutableState<List<Country>> = mutableStateOf(emptyList())
    override val countries: List<Country> get() = _countries.value

    init {
        Log.e("흐흐", "CountrySelectionImpl init")
        _filterState
            .map { filterState ->
                allCountries
                    .filter { country ->
                        country.isMatchingContinent(filterState.continent)
                                && country.isMatchingQuery(filterState.query)
                    }
                    .sortedBy { it.koreanName }
            }
            .distinctUntilChanged()
            .flowOn(Dispatchers.IO)
            .onEach {
                _countries.value = it
                Log.e("흐흐", "onEach $it")
            }
            .launchIn(coroutineScope)
    }

    override fun updateContinent(continent: Continent?) {
        val updatedState = _filterState.value.copy(continent = continent)
        _filterState.value = updatedState
    }

    override fun updateQuery(query: String) {
        val updatedState = _filterState.value.copy(query = query)
        _filterState.value = updatedState
    }

    private fun Country.isMatchingContinent(continent: Continent?): Boolean {
        return continent == null || continent == this.continent
    }

    private fun Country.isMatchingQuery(query: String?): Boolean {
        return query.isNullOrEmpty() || this.koreanName.contains(query, ignoreCase = true)
    }
}
