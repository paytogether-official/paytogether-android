package com.payto.data.database

import androidx.room.TypeConverter
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

internal class TypeConverter {
    @TypeConverter
    fun fromMemberPayInfoJson(value: String): Map<String, Boolean> {
        return Json.decodeFromString(value)
    }

    @TypeConverter
    fun memberPayInfoToJson(map: Map<String, Boolean>): String {
        return Json.encodeToString(map)
    }
}