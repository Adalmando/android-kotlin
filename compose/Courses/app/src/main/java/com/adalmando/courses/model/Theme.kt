package com.adalmando.courses.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Theme(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourseId: Int,
    val numberTheme: Int
)
