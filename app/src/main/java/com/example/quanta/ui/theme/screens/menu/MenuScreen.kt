package com.example.quanta.ui.theme.screens.menu

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.quanta.R
import com.example.quanta.navigation.ROUT_BMW
import com.example.quanta.navigation.ROUT_CRUISER
import com.example.quanta.navigation.ROUT_DEFENDER
import com.example.quanta.navigation.ROUT_NOTIFICATION
import com.example.quanta.navigation.ROUT_PORSCHE
import com.example.quanta.navigation.ROUT_ROVER
import com.example.quanta.navigation.ROUT_TESLA

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MenuScreen(navController: NavController){
    Column {
        var selected by remember { mutableIntStateOf(0) }
        Scaffold(
            bottomBar = {
                NavigationBar(
                    containerColor = Color.Red
                ) {
                    bottomNavItems.forEachIndexed { index, bottomNavItem ->
                        NavigationBarItem(
                            selected = index == selected,
                            onClick = {
                                selected = index
                                navController.navigate(bottomNavItem.route)
                            },
                            icon = {
                                BadgedBox(
                                    badge = {
                                        if (bottomNavItem.badges != 0) {
                                            Badge {
                                                Text(text = bottomNavItem.badges.toString())
                                            }
                                        } else if (bottomNavItem.hasNews) {
                                            Badge()
                                        }
                                    }
                                ) {
                                    Icon(
                                        imageVector =
                                        if (index == selected)
                                            bottomNavItem.selectedIcon
                                        else
                                            bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title
                                    )
                                }

                            },
                            label = {
                                Text(text = bottomNavItem.title)
                            }
                        )
                    }
                }

            },

            topBar = {
                TopAppBar(
                    title = {
                        Text(
                            text = "QUANTA",
                            color = Color.White
                        )
                    },
                    colors = TopAppBarDefaults.mediumTopAppBarColors(Color.Red),
                    actions = {
                        IconButton(onClick = {navController.navigate(ROUT_NOTIFICATION)}) {
                            Icon(
                                imageVector = Icons.Default.Notifications,
                                contentDescription = "notification",
                                tint = Color.White
                            )
                        }
                    },
                )
            },

            content = @Composable {
                Column(
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                ) {
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(280.dp),
                        contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_6),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 60.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))

                        //Start of row1
                        Row (
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .horizontalScroll(rememberScrollState())
                        ){
                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_CRUISER)}
                            ){
                                Box (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.img_7),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }

                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .verticalScroll(rememberScrollState())
                                    .clickable {navController.navigate(ROUT_CRUISER)},
                                colors = CardDefaults.cardColors(Color.White)
                            ){
                                Text(
                                    text = "LandCruiser LC300",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "Ksh. 12,500,000",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "The Toyota Land Cruiser LC300 is a rugged, full-size SUV known for its off-road capability and durability.",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                            }

                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_ROVER)}
                            ){
                                Box (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.img_8),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }
                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_ROVER)}
                                    .verticalScroll(rememberScrollState()),
                                colors = CardDefaults.cardColors(Color.White)
                            ){
                                Text(
                                    text = "Range Rover SV",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "Ksh. 19,250,000",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))


                                Text(
                                    text = "The Range Rover SV is a high-performance, luxury SUV with a focus on advanced technology, premium materials, and exceptional comfort.",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                            }
                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_PORSCHE)}
                            ){
                                Box (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.img_9),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }
                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_PORSCHE)}
                                    .verticalScroll(rememberScrollState()),
                                colors = CardDefaults.cardColors(Color.White)
                            ) {
                                Text(
                                    text = "Porsche 911 GT3 RS",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "Ksh. 28,750,000",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))


                                Text(
                                    text = "The Porsche 911 GT3 RS is a high-performance sports car featuring a 4.0-liter flat-six engine.",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )
                            }
                        }
                        //End of row1

                        Spacer(modifier = Modifier.height(30.dp))

                        //Start of row2
                        Row (
                            modifier = Modifier
                                .padding(start = 20.dp)
                                .horizontalScroll(rememberScrollState())
                        ){
                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_TESLA)}
                            ){
                                Box (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.img_10),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }

                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_TESLA)}
                                    .verticalScroll(rememberScrollState()),
                                colors = CardDefaults.cardColors(Color.White)
                            ){
                                Text(
                                    text = "Tesla Cybertruck",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "Ksh. 7,500,000",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "The Tesla Cybertruck is a futuristic electric pickup with a distinctive angular design.",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )
                            }

                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_BMW)}
                            ){
                                Box (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.img_11),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }
                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_BMW)}
                                    .verticalScroll(rememberScrollState()),
                                colors = CardDefaults.cardColors(Color.White)
                            ){
                                Text(
                                    text = "BMW M3",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "Ksh. 11,750,000",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))


                                Text(
                                    text = "The BMW M3 is a high-performance sports sedan known for its powerful engine, precise handling, and dynamic driving experience.",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )
                            }
                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_DEFENDER)}
                            ){
                                Box (
                                    modifier = Modifier
                                        .fillMaxSize(),
                                    contentAlignment = Alignment.Center
                                ){
                                    Image(
                                        painter = painterResource(id = R.drawable.img_12),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .fillMaxSize(),
                                        contentScale = ContentScale.Crop
                                    )
                                }
                            }
                            Card (
                                modifier = Modifier
                                    .height(200.dp)
                                    .width(200.dp)
                                    .clickable {navController.navigate(ROUT_DEFENDER)}
                                    .verticalScroll(rememberScrollState()),
                                colors = CardDefaults.cardColors(Color.White)
                            ) {
                                Text(
                                    text = "Land Rover Defender",
                                    color = Color.Black,
                                    fontSize = 20.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp, top = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))

                                Text(
                                    text = "Ksh. 12,670,000",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                                Spacer(modifier = Modifier.height(20.dp))


                                Text(
                                    text = "The Land Rover Defender is a rugged and versatile SUV designed for off-road capability and durability.",
                                    color = Color.Black,
                                    fontSize = 15.sp,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )
                            }
                        }
                        //End of row2
                    Spacer(modifier = Modifier.height(120.dp))

                }
            }
        )
    }
}

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Menu",
        route="menu",
        selectedIcon=Icons.Outlined.Menu,
        unselectedIcon=Icons.Outlined.Menu,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Contact us",
        route="contact",
        selectedIcon=Icons.Filled.Call,
        unselectedIcon=Icons.Outlined.Call,
        hasNews = false,
        badges=0
    ),

    BottomNavItem(
        title = "Add",
        route="add_products",
        selectedIcon=Icons.Filled.Add,
        unselectedIcon=Icons.Outlined.Add,
        hasNews = false,
        badges=0
    ),

    )

data class BottomNavItem(
    val title :String,
    val route :String,
    val selectedIcon: ImageVector,
    val unselectedIcon : ImageVector,
    val hasNews :Boolean,
    val badges :Int
)

@Composable
@Preview(showBackground = true)
fun MenuScreenPreview(){
    MenuScreen(rememberNavController())
}
