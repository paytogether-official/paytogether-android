package com.payto.feature.common.ext

import com.payto.feature.R
import com.payto.model.ExpenseCategory

fun ExpenseCategory.getDrawableId(isSelected: Boolean = true): Int {
    return when (this) {
        ExpenseCategory.ETC -> if (isSelected) R.drawable.category_default_on else R.drawable.category_default
        ExpenseCategory.FOOD -> if (isSelected) R.drawable.category_food_on else R.drawable.category_food
        ExpenseCategory.TRANSPORT -> if (isSelected) R.drawable.category_bus_on else R.drawable.category_bus
        ExpenseCategory.SIGHTSEEING -> if (isSelected) R.drawable.category_ticket_on else R.drawable.category_ticket
        ExpenseCategory.SHOPPING -> if (isSelected) R.drawable.category_shopping_on else R.drawable.category_shopping
        ExpenseCategory.ACCOMMODATION -> if (isSelected) R.drawable.category_hotel_on else R.drawable.category_hotel
        ExpenseCategory.FLIGHT -> if (isSelected) R.drawable.category_airplane_on else R.drawable.category_airplane
    }
}