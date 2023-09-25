package com.adalmando.modifiers

import android.content.res.Configuration
import android.graphics.Paint.Style
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.adalmando.modifiers.ui.theme.ModifiersTheme
import org.w3c.dom.Text
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ModifiersTheme {
                MyComponent()
            }
        }
    }
}

@Composable
fun MyTexts(){
    Row {
        Column(modifier = Modifier
            .padding(start = 8.dp)){
            MyText(
                "Hello world",
                MaterialTheme.colorScheme.primary
            )

            Spacer(
                modifier = Modifier
                    .height(16.dp)
            )

            MyText(
                "Hello Ghoul",
                MaterialTheme.colorScheme.onBackground
            )
        }
    }
}

@Composable
fun MyText(text: String, color: Color){
    Text(text = text, color = color)
}

@Composable
fun MyImages(){
    Image(painter = painterResource(
        id = R.drawable.ic_launcher_foreground),
        contentDescription = "Minha imagem",
        modifier = Modifier
            .size(64.dp)
            .clip(CircleShape)
            .background(MaterialTheme.colorScheme.primary)
    )
}

@Composable
fun MyComponent(){
    Row(modifier = Modifier
        .background(MaterialTheme.colorScheme.background)
        .padding(8.dp)
    ) {
        MyImages()
        MyTexts()
    }
}

@Composable
@Preview(showSystemUi = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES)
fun PreviewMyComponent(){
    ModifiersTheme {
        MyComponent()
    }
}