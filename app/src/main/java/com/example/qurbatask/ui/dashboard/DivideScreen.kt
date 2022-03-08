package com.example.qurbatask.ui.dashboard

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun DivideScreen(){
    DivideDesign()
}

@Composable
fun  DivideDesign(){
    Box(modifier = Modifier.fillMaxHeight().fillMaxWidth(), contentAlignment = Alignment.Center) {
        Text(text = "Divide",modifier = Modifier.background(color = Color.White).padding(10.dp), textAlign = TextAlign.Center)
    }
}

@Preview
@Composable
fun DivideDesignDisplay(){
    DivideDesign()
}