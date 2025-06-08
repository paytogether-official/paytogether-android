package com.payto.data.database.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.payto.model.ExpenseSettingModel

@Entity(tableName = "Journey")
internal data class JourneyEntity(
    @PrimaryKey val id: String,
    val isClosed: Boolean,
    val payer: String,
    val memberInfo: Map<String, Boolean>
) {
    fun asExpenseSettingModel(): ExpenseSettingModel {
        return ExpenseSettingModel(
            payer = payer,
            memberInfoMap = memberInfo
        )
    }
}

fun ExpenseSettingModel.asEntity(id: String, isClosed: Boolean) {
    JourneyEntity(
        id = id,
        isClosed = isClosed,
        payer = payer,
        memberInfo = memberInfoMap
    )
}
