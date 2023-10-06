package com.example.remindersapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import com.example.remindersapp.data.DataSource
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
    Card (modifier = modifier){
        Column {
            Image(
                painter = painterResource(id = remindersapp.imageResourceId),
                contentDescription = stringResource(id = remindersapp.stringResourceId)
            )
        }
    }
}

@Preview
@Composable
fun RemindersAppCardPreview() {
    RemindersAppCard(remindersapp() = DataSource.remindersapp[0])
}
@Preview(showBackground = true)
@Composable
fun RemindersAppPreview() {
    RemindersAppTheme { }

}