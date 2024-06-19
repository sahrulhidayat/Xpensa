package com.sahidev.xpensa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.sahidev.xpensa.core.ui.component.MainApp
import com.sahidev.xpensa.core.ui.theme.XpensaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            XpensaTheme {
                MainApp()
            }
        }
    }
}