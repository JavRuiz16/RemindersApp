package com.example.remindersapp.data

import com.example.remindersapp.R
import com.example.remindersapp.RemindersApp

object DataSource {
    val Reminders = listOf(
            RemindersApp().(R.string.work, R.drawable.work),
            RemindersApp().(R.string.study, R.drawable.study),
            RemindersApp().(R.string.meditate, R.drawable.meditate),
            RemindersApp().(R.string.sleep, R.drawable.sleep),
            RemindersApp().(R.string.party, R.drawable.party),
            RemindersApp().(R.string.friends, R.drawable.friends),
            RemindersApp().(R.string.exercise, R.drawable.ecercise),
            RemindersApp().(R.string.meditate, R.drawable.meditate)
    )
}

