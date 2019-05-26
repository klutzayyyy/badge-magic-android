package org.fossasia.badgemagic.data.device.model

import androidx.annotation.StringRes
import com.squareup.moshi.FromJson
import com.squareup.moshi.ToJson
import org.fossasia.badgemagic.R

enum class Mode(val hexValue: Byte, @StringRes val stringResId: Int) {
    LEFT(0x00, R.string.mode_left),
    RIGHT(0x01, R.string.mode_right),
    UP(0x02, R.string.mode_up),
    DOWN(0x03, R.string.mode_down),
    FIXED(0x04, R.string.mode_fixed),
    SNOWFLAKE(0x05, R.string.mode_snowflake),
    PICTURE(0x06, R.string.mode_picture),
    ANIMATION(0x07, R.string.mode_animation),
    LASER(0x08, R.string.mode_laser);

    class Adapter {
        @ToJson
        fun toJson(status: Mode): Int {
            return status.ordinal
        }

        @FromJson
        fun fromJson(value: Int): Mode {
            return values()[value]
        }
    }
}
