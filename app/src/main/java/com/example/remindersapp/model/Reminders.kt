package com.example.remindersapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes


data class Monday(

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)
data class Tuesday(

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)

data class Wednesday(

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)

data class Thursday(

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)

data class Friday(

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)

data class Saturday(

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)

data class Sunday(

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)

data class Reminder1(

    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int,
)

