package com.example.composetest.ui

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.BlendMode
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import androidx.ui.tooling.preview.Preview

@Composable
fun ProfileHead() {
  Surface(color = MaterialTheme.colors.primary) {
    Column(
      modifier = Modifier
        .padding(16.dp).fillMaxWidth().wrapContentHeight(),
      horizontalGravity = Alignment.CenterHorizontally
    ) {
      Image(
        modifier = Modifier
          .width(70.dp).height(70.dp)
          .border(border = BorderStroke(1.dp, color = Color.White), shape = CircleShape)
          .clip(shape = CircleShape)
          .padding(8.dp),
        asset = Icons.Filled.Person,
        colorFilter = ColorFilter.tint(color = Color.White)
      )

      Spacer(modifier = Modifier.padding(8.dp))

      Text(text = "code style", style = MaterialTheme.typography.h6)

      Spacer(modifier = Modifier.padding(top = 2.dp))
      Text(text = "youtube", style = MaterialTheme.typography.caption)

      Spacer(modifier = Modifier.padding(8.dp))
      Row(
        horizontalArrangement = Arrangement.spacedBy(30.dp),

        ) {
        Icon(asset = Icons.Filled.Favorite)
        Icon(asset = Icons.Filled.Share)
      }

      Spacer(modifier = Modifier.padding(8.dp))
      FollowView()
    }
  }
}

@Composable
fun FollowView() {
  Row(modifier = Modifier.fillMaxWidth()) {
    Box(modifier = Modifier.weight(1f), gravity = Alignment.Center) {
      Text(text = "Followers", style = MaterialTheme.typography.caption)
      Text(text = "111", style = MaterialTheme.typography.h5)
    }

    Box(modifier = Modifier.weight(1f),gravity = Alignment.Center) {
      Text(text = "Following", style = MaterialTheme.typography.caption)
      Text(text = "222", style = MaterialTheme.typography.h5)
    }
  }
}

@Preview
@Composable
fun PreviewProfileHead() {
  ComposeTestTheme {
    ProfileHead()
  }
}