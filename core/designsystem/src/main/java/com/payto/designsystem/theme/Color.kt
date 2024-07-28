package com.payto.designsystem.theme

import androidx.compose.ui.graphics.Color

object Colors {
    internal object Primary {
        val primary = Color(0xFF2C7EFF)
        val primary100 = Color(0xFFDCEAFF)
        val primary200 = Color(0xFFB9D4FF)
        val primary300 = Color(0xFF95BFFF)
        val primary400 = Color(0xFF72A9FF)
        val primary500 = Color(0xFF4F94FF)
        val primary600 = Color(0xFF0566FF)
        val primary700 = Color(0xFF0056DD)
        val primary800 = Color(0xFF0047B6)
        val primary900 = Color(0xFF00378F)
        val primary1000 = Color(0xFF002868)
    }

    internal object Secondary {
        val secondary = Color(0xFFFAFAFB)
        val secondary100 = Color(0xFFFCFCFD)
        val secondary200 = Color(0xFFE2E2E8)
        val secondary300 = Color(0xFFCACAD5)
        val secondary400 = Color(0xFFB2B2C1)
        val secondary500 = Color(0xFF9A9AAE)
        val secondary600 = Color(0xFF82829B)
        val secondary700 = Color(0xFF6B6B86)
        val secondary800 = Color(0xFF58586E)
        val secondary900 = Color(0xFF454556)
        val secondary1000 = Color(0xFF32323E)
    }

    internal object Neutrals {
        val baseWhite = Color(0xFFFAFAFA)
        val baseBlack = Color(0xFF0A0A0B)
        val neutrals100 = Color(0xFFFAFAFB)
        val neutrals200 = Color(0xFFF3F4F8)
        val neutrals300 = Color(0xFFE7E9EC)
        val neutrals400 = Color(0xFFB1B8C0)
        val neutrals500 = Color(0xFF6D7582)
        val neutrals600 = Color(0xFF505866)
        val neutrals700 = Color(0xFF343942)
        val neutrals800 = Color(0xFF26292E)
        val neutrals900 = Color(0xFF1D2024)
        val neutrals1000 = Color(0xFF151719)
    }

    internal object Success {
        val success = Color(0xFF0BBD4A)
        val success100 = Color(0xFF9DF9BE)
        val success200 = Color(0xFF3CF47D)
        val success300 = Color(0xFF088634)
    }

    internal object Warning {
        val warning = Color(0xFFF2981A)
        val warning100 = Color(0xFFFBDDB3)
        val warning200 = Color(0xFFF6BA66)
        val warning300 = Color(0xFFB16C0A)
    }

    internal object Error {
        val error = Color(0xFFE6533E)
        val error100 = Color(0xFFF7C6BF)
        val error200 = Color(0xFFEE8C7E)
        val error300 = Color(0xFFB42B17)
    }

    object Color {
        object Primary {
            val normal = Colors.Primary.primary
        }

        object Label {
            val normal = Neutrals.neutrals1000
            val neutral = Neutrals.neutrals700
            val alternative = Neutrals.neutrals500
            val disable = Neutrals.neutrals400
        }

        object Background {
            val normal = Neutrals.baseWhite
            val alternative = Neutrals.neutrals200
        }

        object Line {
            val normal = Neutrals.neutrals300
            val neutral = Neutrals.neutrals200
            val alternative = Neutrals.neutrals100
        }

        object Status {
            val success = Success.success
            val warning = Warning.warning
            val error = Error.error
        }

        object Inverse {
            val primary = Colors.Primary.primary
            val background = Neutrals.baseBlack
            val label = Secondary.secondary100
        }

        object Static {
            val white = Neutrals.baseWhite
            val black = Neutrals.baseBlack
        }
    }

    object Component {
        object Fill {
            val primary = Primary.primary100
            val normal = Neutrals.neutrals100
            val strong = Neutrals.neutrals300
            val alternative = Neutrals.neutrals200
        }

        object Material {
            val dimmer = Neutrals.baseBlack.copy(alpha = 0.4f)
        }
    }
}
