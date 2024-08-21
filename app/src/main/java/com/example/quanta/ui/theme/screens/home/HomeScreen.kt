package com.example.quanta.ui.theme.screens.home


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.quanta.navigation.ROUT_ABOUT


@Composable
fun HomeScreen(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = com.example.quanta.R.drawable.img_2),
            contentDescription = "home",
            modifier = Modifier
                .size(350.dp)
                .clip(shape = RectangleShape),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "QUANTA",
            fontSize = 60.sp,
            color = Color.Red,

            )

        Text(
            text = "Your online shopping choice",
            fontSize = 20.sp,
        )


         Spacer(modifier = Modifier.height(60.dp))

          Button(
             onClick = { navController.navigate(ROUT_ABOUT) },

             modifier = Modifier
                 .height(70.dp)
                 .width(300.dp)
                 .padding(start = 20.dp, end = 20.dp),
             colors = ButtonDefaults.buttonColors(Color.Red),
             shape = RoundedCornerShape(10.dp)
          ){
              Text(text = "Get Started")
          }

    }

}




@Composable
@Preview(showBackground = true)
fun HomeScreenPreview(){
    HomeScreen(rememberNavController())
}

