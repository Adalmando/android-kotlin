package com.adalmando.lemonade2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adalmando.lemonade2.ui.theme.Lemonade2Theme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Lemonade2Theme {
                LemonApp()
            }
        }
    }
}

@Composable
fun LemonApp(){

    var result by remember { mutableStateOf(1) }

    when(result){

        1 -> Surface(modifier = Modifier.fillMaxSize()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(R.drawable.image_one),
                    contentDescription = stringResource(id = R.string.description_one),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable { result++ }
                )
                Spacer(
                    modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = R.string.text_one))
            }
        }

        2 -> Surface(modifier = Modifier.fillMaxSize()) {

            var count by remember {mutableStateOf(0)}
            var randomNumber by remember {mutableStateOf((3..5).random())}

            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(R.drawable.image_two),
                    contentDescription = stringResource(id = R.string.description_two),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable {
                            count++
                            if(count == randomNumber){
                                result++
                            }
                        }
                )
                Spacer(
                    modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = R.string.text_two))
            }
        }

        3 -> Surface(modifier = Modifier.fillMaxSize()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(R.drawable.image_three),
                    contentDescription = stringResource(id = R.string.description_three),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable { result++ }
                )
                Spacer(
                    modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = R.string.text_three))
            }
        }

        4 -> Surface(modifier = Modifier.fillMaxSize()) {
            Column(horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center,
            ) {
                Image(
                    painter = painterResource(R.drawable.image_four),
                    contentDescription = stringResource(id = R.string.description_four),
                    modifier = Modifier
                        .wrapContentSize()
                        .clickable { result = 1 }
                )
                Spacer(
                    modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = R.string.text_four))
            }
        }
    }
}

@Preview
@Composable
fun GreetingPreview() {
    Lemonade2Theme {
       LemonApp()
    }
}