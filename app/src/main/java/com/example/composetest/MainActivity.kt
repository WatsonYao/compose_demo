package com.example.composetest

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
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
          MainContent2()
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

@Composable
fun MainContent2() {
  val data = listOf("9:00 am", "11:00 am", "12:30 pm", "2:30 pm")
  ComposeTestTheme {
    Surface(color = MaterialTheme.colors.background) {
      Column {
        TopAppBar(title = { Text(text = "tv series") })
        CardContent(data)
      }
    }
  }
}

@Composable
fun CardContent(data: List<String>) {
  Card(modifier = Modifier.padding(16.dp)) {
    Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
      Column(modifier = Modifier.fillMaxWidth().wrapContentHeight()) {
        Box(
          backgroundColor = Color.LightGray,
          modifier = Modifier.fillMaxWidth().height(100.dp).clickable(onClick = {})
        )
        Box(
          modifier = Modifier.fillMaxWidth().wrapContentHeight()
        ) {
          Column(modifier = Modifier.fillMaxWidth().padding(16.dp)) {
            Text(
              modifier = Modifier.fillMaxWidth(),
              text = "the big bang theory",
              fontSize = 22.sp,
              color = Color.Black
            )
            Spacer(modifier = Modifier.padding(6.dp))
            Text(
              modifier = Modifier.fillMaxWidth(),
              text = "rating 4.8 / 5",
              fontSize = 13.sp,
              color = Color.DarkGray
            )
            Text(
              modifier = Modifier.fillMaxWidth(),
              text = "Science & Entertainment",
              fontSize = 13.sp,
              color = Color.DarkGray
            )
            Spacer(modifier = Modifier.padding(6.dp))
            Text(
              modifier = Modifier.fillMaxWidth(),
              text = "The big bang theory is a xxxxxx",
              fontSize = 15.sp,
            )
          }
        }

        Divider(
          modifier = Modifier.fillMaxWidth()
            .padding(start = 16.dp, end = 16.dp, top = 5.dp, bottom = 5.dp)
        )

        Box(
          modifier = Modifier.fillMaxWidth().wrapContentHeight().padding(16.dp)
        ) {
          Column(modifier = Modifier.fillMaxWidth()) {
            Text(
              modifier = Modifier.fillMaxWidth(),
              text = "show timings",
              color = Color.Black,
              fontSize = 17.sp
            )
            data.forEach {
              Card(
                modifier = Modifier.padding(8.dp),
                shape = RoundedCornerShape(16.dp),
                elevation = 0.dp,
              ) {
                Text(text = it)
              }
            }
          }
        }
      }
    }
  }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeTestTheme {
    MainContent2()
  }
}