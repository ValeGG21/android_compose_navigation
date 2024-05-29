package com.example.navigation_compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.navigation_compose.ControllerNavigation.NavComponent
import com.example.navigation_compose.ui.theme.Navigation_composeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           Navigation_composeTheme {
               NavComponent()
           }
       }
   }
}