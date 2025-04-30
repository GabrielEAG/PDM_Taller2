package com.agarcia.GabrielAguilar_00181423

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.agarcia.GabrielAguilar_00181423.ui.layout.CustomScaffold
import com.agarcia.GabrielAguilar_00181423.ui.theme.MyFirstAndroidAppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      MyFirstAndroidAppTheme {
        CustomScaffold()
      }
    }
  }
}