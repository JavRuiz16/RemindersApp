package com.example.remindersapp

import android.os.Bundle
import android.provider.CalendarContract.Reminders
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.PointerIcon.Companion.Text
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.SemanticsProperties.Text
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.remindersapp.data.DataSource
import com.example.remindersapp.data.Reminder
import com.example.remindersapp.model.remindersapp
import com.example.remindersapp.ui.theme.RemindersAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RemindersAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background, content = ::RemindersApp)
            }
        }
    }
}

@Composable
fun RemindersApp () {

}

@Composable
fun RemindersAppList(RemindersAppList: List<Reminder>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier) {
        items(RemindersAppList) { planet ->
            RemindersApp() Card (
                    remindersapp = remindersapp,
            modifier = Modifier.padding(8.dp)
            )
        }

    }

}
@Composable
fun RemindersAppCard(remindersapp: remindersapp, modifier: Modifier = Modifier) {
    Card (modifier = modifier){
        Column {
            Image(
                painter = painterResource(id = remindersapp.imageResourceId),
                contentDescription = stringResource(id = remindersapp.stringResourceId)
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(194.dp)
                            .background(Color.Black),
            )
            Text(
                text = stringResource(id = remindersapp.stringResourcesID),
                        modifier = Modifier.padding(16.dp),
                        style = MaterialTheme.typography.headlineSmall
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