package com.example.prj18092024

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.prj18092024.ui.theme.Prj18092024Theme
import com.example.prj18092024.ui.theme.view.MainGui
import com.example.prj18092024.ui.theme.view.MainGui_ViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = MainGui_ViewModel()

        enableEdgeToEdge()
        setContent {
                MainGui(viewModel)
            }
        }
    }
}
