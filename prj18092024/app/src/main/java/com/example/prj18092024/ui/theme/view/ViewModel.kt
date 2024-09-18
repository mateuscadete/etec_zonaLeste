package com.example.prj18092024.ui.theme.view

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun MainGui(modifier: Modifier = Modifier) {
    val contadorvaluestate : int by MainGui_ViewModel.contador.observeAsState(0)

    Scaffold {padding ->
        Column {
            Text(text = "===================")
            Text(text = "===================")
            Text(text = "===================")

            Text(text = "===================")
            Text(text = "===================")
            Text(text = "===================")
            Text(text = "===================")

            TextField(value = contadorvaluestate.toString(),
                onValueChange = {} )

            Text(text = "====================")
            Button(onClick = {
                MainGui_ViewModel.updateContador()
            }) {


            }
        }
    }

}

