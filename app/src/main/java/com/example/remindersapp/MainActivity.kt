package com.example.remindersapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.remindersapp.model.remindersapp
import com.example.remindersapp.ui.theme.RemindersAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RemindersAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    RemindersApp()

                }
            }
        }
    }
}

@Composable
fun RemindersApp () {

}

@Composable
fun RemindersAppCard(remindersapp: remindersapp, modifier: Modifier = Modifier) {
}


@Preview(showBackground = true)
@Composable
fun RemindersAppPreview() {
    RemindersAppTheme { }

}