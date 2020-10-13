package com.example.composetest

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.Image
import androidx.compose.foundation.Text
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.gestures.rememberScrollableController
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.State
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawShadow
import androidx.compose.ui.gesture.scrollorientationlocking.Orientation
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.ConfigurationAmbient
import androidx.compose.ui.platform.setContent
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.ui.tooling.preview.Preview
import com.example.composetest.ui.ComposeTestTheme
import dev.chrisbanes.accompanist.coil.CoilImage
import java.nio.file.attribute.FileOwnerAttributeView

class MainActivity : AppCompatActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeTestTheme {
        // A surface container using the 'background' color from the theme
        Screen3()
      }
    }
  }
}

@Preview
@Composable
fun Screen3() {
  Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = Modifier.fillMaxWidth()
  ) {
    val usernameState = remember {
      mutableStateOf(TextFieldValue())
    }
    TextField(
      value = usernameState.value,
      onValueChange = {
        usernameState.value = it
      },
      placeholder = { Text("password") },
      visualTransformation = PasswordVisualTransformation(),
      keyboardType = KeyboardType.Password,
      modifier = Modifier.padding(horizontal = 32.dp, vertical = 8.dp)
    )
    Button(
      onClick = {

      },
      modifier = Modifier.background(Color.Black).size(width = 120.dp, height = 56.dp)
    ) {
      Text(text = "click me", color = Color.White)
    }
  }
}

//@Preview
@Composable
fun Screen2() {
  val modifier = Modifier.size(100.dp)
  Row(verticalAlignment = Alignment.CenterVertically) {
    Box(
      modifier = modifier.then(Modifier.background(Color.Red))
    )
    Box(
      modifier = modifier.then(Modifier.background(Color.Yellow))
    )
    Box(
      modifier = modifier.then(Modifier.background(Color.Blue))
    )
  }
}

@Composable
fun Screen() {
  val offset = remember {
    mutableStateOf(0f)
  }
  val ctrlr = rememberScrollableController {
    offset.value += it
    it
  }
  Row(
    Modifier
      .background(Color.Black)
      .fillMaxSize()
      .scrollable(
        Orientation.Horizontal,
        ctrlr,
      )
  ) {
    MoviePoster()
    MoviePoster()
    MoviePoster()
  }
}

@Composable
fun MoviePoster(modifier: Modifier = Modifier) {
  val screenSize = ConfigurationAmbient.current.screenHeightDp.dp * .75f
  onCommit {
    Log.i("temp", System.currentTimeMillis().toString())
  }
  Column(
    horizontalAlignment = Alignment.CenterHorizontally,
    modifier = modifier
      .clip(RoundedCornerShape(20.dp))
      .width(240.dp)
      .background(Color.White)
      .padding(20.dp)
  ) {
    CoilImage(
      "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1602566591299&di=dca980f2627552567415fe1eed214cd4&imgtype=0&src=http%3A%2F%2Fp6.itc.cn%2Fimages03%2F20200517%2F0b3385eac2254b798fa00b4433199c93.jpeg",
      contentScale = ContentScale.Crop,
      modifier = Modifier
        .width(180.dp)
        .aspectRatio(9f / 16)
        .clip(RoundedCornerShape(10.dp))
    )
    Text(
      "Tenet",
      fontSize = 24.sp,
      color = Color.Black,
      modifier = Modifier.padding(vertical = 12.dp)
    )
    Row() {
      Chip("action")
      Chip("drama")
      Chip("history")
    }

    StartRating(9.0f)
    Spacer(Modifier.height(30.dp))
    BuyTicket() {
      Log.i("temp", "buy it")
    }
  }
}

@Composable
fun BuyTicket(onClick: () -> Unit) {
  Button(
    onClick = onClick,
    backgroundColor = Color.DarkGray,
    elevation = 0.dp,
    modifier = Modifier
      .fillMaxWidth()
  ) {
    Text(
      "Buy Ticket",
      color = Color.White
    )
  }
}

@Composable
fun StartRating(rating: Float) {

}

@Composable
fun Chip(label: String, modifier: Modifier = Modifier) {
  Text(
    label,
    fontSize = 12.sp,
    color = Color.Gray,
    modifier = modifier
      .border(1.dp, Color.Gray, RoundedCornerShape(50))
      .padding(horizontal = 8.dp, vertical = 4.dp)
  )
}

