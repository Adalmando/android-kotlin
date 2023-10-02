package com.adalmando.courses.screens

import android.graphics.Paint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.adalmando.courses.R
import com.adalmando.courses.data.DataSource
import com.adalmando.courses.model.Theme

@Composable
fun MainScreen(){
    ThemeGrid()
}

@Composable
fun ThemeGrid(modifier: Modifier = Modifier){
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
        horizontalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.padding_small)),
        modifier = modifier.padding(8.dp)
    ) {
        items(DataSource.themes) { theme ->
            ThemeCard(theme)
        }
    }
}

@Composable
fun ThemeCard(theme: Theme, modifier: Modifier = Modifier){
    Card(modifier = modifier) {
        Row {
            Box {
                Image(
                    painter = painterResource(id = theme.imageResourseId),
                    contentDescription = null,
                    modifier = Modifier
                        .size(
                            68.dp,
                            68.dp
                        )
                        .aspectRatio(
                            1f
                        ), // proporção da imagem 1 = 4/4 imagem quadrada
                    contentScale = ContentScale.Crop // escala da imagem crop = se ajusta ao elemento q ela
                    // está dentro, nesse caso se ajustará para preencer toda a box
                )
            }
            Column(modifier = Modifier
                .padding(top = 16.dp,
                    start = 16.dp,
                    end = 16.dp
                )
            ) {
                Text(
                    text = stringResource(id = theme.stringResourceId),
                    fontSize = 14.sp
                )
                Row(modifier = Modifier
                    .padding(
                        top = 8.dp
                    ),
                    verticalAlignment = Alignment.CenterVertically // alinha no centro verticalmente
                ) {
                    Icon(
                        painter = painterResource(id = R.drawable.ic_icon),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(end = 8.dp
                            )
                    )
                    Text(
                        text = theme.numberTheme.toString()
                    )
                }
                }
        }
    }
}

@Composable
@Preview(showBackground = true)
fun ViewCard(){
    ThemeGrid()
}