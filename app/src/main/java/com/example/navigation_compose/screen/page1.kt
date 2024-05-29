package com.example.navigation_compose.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.navigation_compose.R



@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Horizontal(navegationHostController: NavHostController){
    val pagerState = rememberPagerState(initialPage = 0) {
        3
    }
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Box(modifier = Modifier.fillMaxSize()){
            HorizontalPager(state = pagerState, modifier = Modifier.fillMaxSize()) {
                    page -> when(page) {
                0 -> parte1(pagerState)
                1 -> parte2(pagerState)
                2 -> parte3(navegationHostController , pagerState)
            }
            }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun parte1(pagerState : PagerState){
    Column(modifier = Modifier
        .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Column(modifier = Modifier
            .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally) {
            val colores = Color.Green
            Filas(img = R.drawable.page1_1, descript = "####")
            Text(text = "¿Qué es la Agropecuria?",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp, 10.dp),
                textAlign = TextAlign.Center,
                fontSize = 21.sp,
                color = colores)
            Text(text = "La agropecuaria es crucial para el desarrollo económico y social, ya que es una " +
                    "fuente principal de alimentos, materias primas y empleo. Contribuye significativamente" +
                    " a la seguridad alimentaria al garantizar el suministro constante de productos esenciales." +
                    " Además, promueve el desarrollo rural y mejora la calidad de vida de las comunidades, al " +
                    "proporcionar ingresos y oportunidades laborales. La integración de agricultura y " +
                    "ganadería optimiza el uso de los recursos naturales, favoreciendo prácticas sostenibles " +
                    "que preservan el medio ambiente y ayudan a mitigar el cambio climático." +
                    "Por estas razones, la agropecuaria es fundamental para un desarrollo equilibrado y sostenible.",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(20.dp),
                textAlign = TextAlign.Justify)
            Puntos(pagerState)

        }

    }
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Puntos(pagerState: PagerState) {
    Row(modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center) {

        repeat(3){
            var color = if (pagerState.currentPage == it) Color.Black else Color.Green
            Box(modifier = Modifier
                .padding(2.dp)
                .clip(CircleShape)
                .background(color)
                .size(12.dp)){
            }
        }
    }
}

@Composable
fun Filas(
    img:Int,
    descript:String,
    modifier: Modifier = Modifier
        .fillMaxWidth(),
){
    Row{
        Image(painter = painterResource(id = img), contentDescription = descript, modifier = Modifier
            .width(350.dp)
            .height(350.dp)
            .padding(20.dp, 20.dp))
    }
}