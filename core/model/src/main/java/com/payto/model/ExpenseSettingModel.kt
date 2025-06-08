package com.payto.model

data class ExpenseSettingModel(
    val payer: String,
    val memberInfoMap: Map<String, Boolean>
) {
    val members = memberInfoMap.toList()
}
