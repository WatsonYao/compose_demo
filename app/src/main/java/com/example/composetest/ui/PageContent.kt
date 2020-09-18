package com.example.composetest.ui

import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun PageContent() {
  Surface(color = MaterialTheme.colors.surface) {
    Column() {
      Tabs()
      VideoContent()
      VideoContent()
      VideoContent()
    }
  }
}

@Composable
private fun Tabs() {
  Row(
    modifier = Modifier.padding(8.dp).fillMaxWidth(),
    horizontalArrangement = Arrangement.SpaceEvenly
  ) {
    Button(onClick = {}, shape = CircleShape) {
      Text(text = "Videos")
    }
    Button(onClick = {}, shape = CircleShape) {
      Text(text = "Playlist")
    }
    Button(onClick = {}, shape = CircleShape) {
      Text(text = "About")
    }
  }
}

@Preview(showBackground = true)
@Composable
fun PreviewPageContent() {
  ComposeTestTheme {
    PageContent()
  }
}
