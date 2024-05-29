package com.example.navigation_compose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.example.navigation_compose.R


@Composable
fun parte4(navegationHostController: NavHostController) {
    val items = listOf("Producción agrícola", "Cultivo de plantas", "Nutrientes", "Estructuras agrícolas", "Suministro de agua", "Recolección de cultivos", "Labranza", "Material orgánico", "Control de malezas", "Control de plagas", "Cultivo sin suelo", "Vehículo aéreo no tripulado")

    val imgs = listOf(R.drawable.cosecha,  R.drawable.herremienta,R.drawable.ubicacion, R.drawable.guante, R.drawable.robot,
        R.drawable.xd, R.drawable.sostenible, R.drawable.agro, R.drawable.granja, R.drawable.inteligente,
        R.drawable.plantacion
    )
    val mix = listOf(
        "Campos Inteligentes", R.drawable.dron,
        "Fertilizantes", R.drawable.compos,
        "Ganado", R.drawable.ganado,
        "torre", R.drawable.torre
    )


    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(items) { item ->
                    Text(text = item, modifier = Modifier.padding(16.dp))
                }
            }
        }

        item {
            LazyRow(modifier = Modifier.fillMaxWidth()) {
                items(imgs) { imagenes ->
                    Image(
                        painter = painterResource(id = imagenes),
                        contentDescription = "",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        }

        items(mix) { item ->
            when (item) {
                is String -> {
                    Text(text = item, modifier = Modifier.padding(16.dp))
                }
                is Int -> {
                    Image(
                        painter = painterResource(id = item),
                        contentDescription = "",
                        modifier = Modifier.padding(16.dp,15.dp)
                    )
                }
            }
        }

        item {
            val color = Color.Transparent
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                contentAlignment = Alignment.Center
            ) {
                Button(
                    onClick = {
                        navegationHostController.navigate("view_1")
                    },
                    modifier = Modifier.fillMaxWidth().padding(100.dp, 0.dp),
                    colors = ButtonDefaults.buttonColors(color)
                ) {
                    Text(text = "R E G R E S A R")
                }
            }
        }
    }
}
