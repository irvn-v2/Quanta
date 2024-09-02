package com.example.quanta.ui.theme.screens.contact

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.outlined.Call
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material.icons.outlined.ShoppingCart
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
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
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.quanta.ui.theme.screens.menu.bottomNavItems

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun ContactScreen(navController: NavController){
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
                                    Icon(imageVector =
                                    if (index == selected)
                                        bottomNavItem.selectedIcon
                                    else
                                        bottomNavItem.unselectedIcon,
                                        contentDescription = bottomNavItem.title)
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
                )

                Spacer(modifier = Modifier.height(50.dp))
            },
            content = @Composable{
                Column (
                    modifier = Modifier
                        .background(Color.White)
                        .fillMaxSize()
                ){
                    Spacer(modifier = Modifier.height(90.dp))

                    Text(
                        text = "Get in Touch",
                        fontWeight = FontWeight.Bold,
                        fontSize = 30.sp,
                        color = Color.Red,
                        modifier = Modifier
                            .padding(start = 5.dp)

                    )
                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Call us now at :",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-0741512929",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 120.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-0724909451",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 120.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Email Address:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-quanta@gmail.com",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 120.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))
                    Text(
                        text = "-info@quanta.org",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 120.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Location:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Intel Centre, Mombasa Road, Machakos near Mombasa Cement",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 120.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Mail:",
                        fontWeight = FontWeight.Bold,
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-P.O. BOX 345 - 00205, MACHAKOS",
                        fontSize = 15.sp,
                        modifier = Modifier
                            .padding(start = 120.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))



                }
            }
        )
    }
}

val bottomNavItems = listOf(
    BottomNavItem(
        title = "Menu",
        route="menu",
        selectedIcon= Icons.Outlined.Menu,
        unselectedIcon= Icons.Outlined.Menu,
        hasNews = false,
        badges=0
    ),



    BottomNavItem(
        title = "Cart",
        route="cart",
        selectedIcon= Icons.Filled.ShoppingCart,
        unselectedIcon= Icons.Outlined.ShoppingCart,
        hasNews = true,
        badges=0
    ),

    BottomNavItem(
        title = "Contact Us",
        route="contact",
        selectedIcon= Icons.Filled.Call,
        unselectedIcon= Icons.Outlined.Call,
        hasNews = true,
        badges=0
    ),

    BottomNavItem(
        title = "Account",
        route="account",
        selectedIcon= Icons.Filled.Person,
        unselectedIcon= Icons.Outlined.Person,
        hasNews = true,
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
fun ContactScreenPreview(){
    ContactScreen(rememberNavController())
}