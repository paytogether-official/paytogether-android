package com.payto.data.network.datasource

import com.payto.data.network.dto.CreateJourneyDTO
import com.payto.data.network.dto.ExpenseDTO
import com.payto.data.network.dto.ExpenseTotalDTO
import com.payto.data.network.dto.JourneyInfoDTO
import com.payto.data.network.service.PaytoService
import com.payto.model.ExpenseParams
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
internal class PaytoDatasource @Inject constructor(
    private val service: PaytoService
) {
    suspend fun getExchangeRate() = service.getExchangeRate()

    suspend fun getLocales() = service.getLocales()

    suspend fun createJourney(createJourneyDTO: CreateJourneyDTO) =
        service.createJourney(createJourneyDTO)

    suspend fun updateJourney(id: String, createJourneyDTO: CreateJourneyDTO) =
        service.updateJourney(id, createJourneyDTO)

    suspend fun getJourneys(ids: List<String>): List<JourneyInfoDTO> {
        val journeyIds = ids.joinToString(",")
        return service.getJourneys(journeyIds)
    }

    suspend fun getJourney(id: String, quoteCurrency: String = "KRW") =
        service.getJourney(id, quoteCurrency)

    suspend fun createExpense(createExpenseDTO: ExpenseDTO) =
        service.createExpense(createExpenseDTO.journeyId, createExpenseDTO)

    suspend fun getExpenses(
        id: String,
        params: ExpenseParams,
    ): ExpenseTotalDTO {
        val quoteCurrency = params.quoteCurrency
        val sort = "expenseDate,${params.order.sortName}"

        return service.getExpenses(
            id,
            quoteCurrency,
            sort,
            params.category?.displayName,
            params.expenseDate
        )
    }

    suspend fun getExpense(id: String, journeyExpenseId: Int, quoteCurrency: String) =
        service.getExpense(id, journeyExpenseId, quoteCurrency)

    suspend fun updateExpense(id: String, journeyExpenseId: Int, createExpenseDTO: ExpenseDTO) =
        service.updateExpense(id, journeyExpenseId, createExpenseDTO)

    suspend fun closeJourney(id: String) = service.closeJourney(id)

    suspend fun getSettlement(id: String, quoteCurrency: String) =
        service.getSettlement(id, quoteCurrency)

    suspend fun getCategories(id: String) = service.getCategories(id)

}
