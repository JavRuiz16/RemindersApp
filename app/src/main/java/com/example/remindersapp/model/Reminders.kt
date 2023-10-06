package com.example.remindersapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class remindersapp(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)
