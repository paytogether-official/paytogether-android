package com.payto.designsystem.theme

import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp

val typography = Typography(
    heading1 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(700),
        fontSize = 28.sp,
        lineHeight = 1.2.em,
    ),
    heading2 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(700),
        fontSize = 24.sp,
        lineHeight = 1.2.em,
    ),
    heading3 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(700),
        fontSize = 20.sp,
        lineHeight = 1.2.em,
    ),
    heading4 = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(700),
        fontSize = 18.sp,
        lineHeight = 1.2.em,
    ),
    featureBold = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(700),
        fontSize = 18.sp,
        lineHeight = 1.2.em,
    ),
    featureAccent = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(600),
        fontSize = 18.sp,
        lineHeight = 1.2.em,
    ),
    featureStandard = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(400),
        fontSize = 18.sp,
        lineHeight = 1.2.em,
    ),
    highlightBold = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(700),
        fontSize = 16.sp,
        lineHeight = 1.2.em,
    ),
    highlightAccent = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(600),
        fontSize = 16.sp,
        lineHeight = 1.2.em,
    ),
    highlightStandard = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(400),
        fontSize = 16.sp,
        lineHeight = 1.2.em,
    ),
    contentBold = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(700),
        fontSize = 14.sp,
        lineHeight = 1.2.em,
    ),
    contentAccent = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(600),
        fontSize = 14.sp,
        lineHeight = 1.2.em,
    ),
    contentRegular = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(400),
        fontSize = 14.sp,
        lineHeight = 1.2.em,
    ),
    captionAccent = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(600),
        fontSize = 12.sp,
        lineHeight = 1.2.em,
    ),
    captionRegular = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(400),
        fontSize = 12.sp,
        lineHeight = 1.2.em,
    ),
    footnoteAccent = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(600),
        fontSize = 10.sp,
        lineHeight = 1.2.em,
    ),
    footnoteRegular = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight(400),
        fontSize = 10.sp,
        lineHeight = 1.2.em,
    ),
)

data class Typography(
    val heading1: TextStyle,
    val heading2: TextStyle,
    val heading3: TextStyle,
    val heading4: TextStyle,
    val featureBold: TextStyle,
    val featureAccent: TextStyle,
    val featureStandard: TextStyle,
    val highlightBold: TextStyle,
    val highlightAccent: TextStyle,
    val highlightStandard: TextStyle,
    val contentBold: TextStyle,
    val contentAccent: TextStyle,
    val contentRegular: TextStyle,
    val captionAccent: TextStyle,
    val captionRegular: TextStyle,
    val footnoteAccent: TextStyle,
    val footnoteRegular: TextStyle,
)
