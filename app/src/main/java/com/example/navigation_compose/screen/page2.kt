package com.example.navigation_compose.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.PagerState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.navigation_compose.R

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun parte2(pagerState : PagerState){
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally) {
        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            val color = Color.Green
            Filas(img = R.drawable.page2_1, descript = "####")
            Text(text = "¿Por qué es importante la agropecuria?",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 21.sp,
                color = color)
            Text(text = "La agropecuaria es una actividad económica que combina la agricultura y la ganadería." +
                    "En la agricultura se cultivan plantas y se producen alimentos, fibras y otros productos vegetales, " +
                    "mientras que la ganadería se dedica a la cría de animales para obtener carne, leche, huevos, lana, " +
                    "cuero y otros productos de origen animal. Esta combinación permite optimizar el uso de la tierra y los " +
                    "recursos naturales, logrando una producción más diversificada y sostenible.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                textAlign = TextAlign.Justify)
            Puntos(pagerState)
        }
    }
}