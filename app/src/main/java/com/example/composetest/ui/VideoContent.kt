package com.example.composetest.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview
import com.example.composetest.R

@Composable
fun VideoContent() {
  Surface(color = MaterialTheme.colors.surface) {
    Column(
      modifier = Modifier.padding(16.dp).fillMaxWidth()
    ) {
      Text(text = "android jetpack compose")
      Card(modifier = Modifier.padding(vertical = 8.dp).fillMaxWidth().height(100.dp)) {
        Image(asset = imageResource(id = R.drawable.bg))
      }
    }
  }

}

@Preview
@Composable
fun PreviewVideoContent() {
  ComposeTestTheme {
    VideoContent()
  }
}