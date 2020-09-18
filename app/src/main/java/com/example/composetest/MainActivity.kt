package com.example.composetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Text
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.setContent
import androidx.ui.tooling.preview.Preview
import com.example.composetest.ui.AppBar
import com.example.composetest.ui.ComposeTestTheme
import com.example.composetest.ui.PageContent
import com.example.composetest.ui.ProfileHead

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeTestTheme {
        // A surface container using the 'background' color from the theme
        Surface(color = MaterialTheme.colors.background) {
          MainContent()
        }
      }
    }
  }
}

@Composable
fun MainContent() {
  Column {
    AppBar()
    ProfileHead()
    PageContent()
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeTestTheme {
    MainContent()
  }
}