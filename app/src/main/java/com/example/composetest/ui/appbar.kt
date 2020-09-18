package com.example.composetest.ui

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Icon
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Surface
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun AppBar() {
  Surface(color = MaterialTheme.colors.primary) {
    TopAppBar(modifier = Modifier.fillMaxWidth()) {
      Row(
        modifier = Modifier.padding(8.dp).fillMaxWidth().fillMaxHeight(),
        verticalGravity = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
      ) {
        Icon(asset = Icons.Filled.ArrowBack)
        OutlinedButton(
          onClick = {},
          //modifier = Modifier.background(color = Color.Transparent)
          backgroundColor = Color.Transparent,
          shape = CircleShape,
          contentColor = Color.White,
          border = BorderStroke(width = 1.dp,color =Color.White)
        ) {
          Text(text = "Follow")
        }
      }
    }
  }
}

@Preview
@Composable
fun PreviewAppbar() {
  ComposeTestTheme {
    AppBar()
  }
}