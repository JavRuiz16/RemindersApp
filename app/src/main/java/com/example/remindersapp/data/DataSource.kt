package com.example.remindersapp.data

import com.example.remindersapp.R

data class Reminder(val titleResId: Int, val iconResId: Int)

object DataSource {
    val remindersapp = listOf(
        Reminder(R.string.work, R.drawable.work),
        Reminder(R.string.study, R.drawable.study),
        Reminder(R.string.meditate, R.drawable.meditate),
        Reminder(R.string.sleep, R.drawable.sleep),
        Reminder(R.string.party, R.drawable.party),
        Reminder(R.string.friends, R.drawable.friends),
        Reminder(R.string.exercise, R.drawable.exercise),
        Reminder(R.string.meditate, R.drawable.meditate)
    )
}














