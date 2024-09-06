package com.example.quanta.ui.theme.screens.bmw

import android.annotation.SuppressLint
import android.content.Intent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.net.toUri
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.quanta.R
import com.example.quanta.navigation.ROUT_NOTIFICATION
import com.example.quanta.ui.theme.screens.menu.bottomNavItems

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun BmwScreen(navController: NavController){
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

            content = @Composable{
                Column (
                    modifier = Modifier
                        .verticalScroll(rememberScrollState())
                        .padding(start = 10.dp)
                ){
                    Box(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(280.dp),
                        contentAlignment = Alignment.Center
                    ) {

                        Image(
                            painter = painterResource(id = R.drawable.img_11),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 60.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))


                    Text(
                        text = "The BMW M3 is a high-performance version of the BMW 3 Series, known for its sporty handling, powerful engines, and refined driving dynamics. Here’s a detailed overview of the BMW M3, focusing on the latest model as of 2024:",
                        fontSize = 20.sp,
                        textAlign = TextAlign.Center
                    )

                    Spacer(modifier = Modifier.height(30.dp))

                    Text(
                        text = "General Overview.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Model: BMW M3 (G80)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Type: M3 Competition",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Introduction Year: 2023 (Expected)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Engine Options.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Standard M3:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Engine: 3.0-liter BMW M TwinPower Turbo inline 6-cylinder",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Power: Approximately 473 horsepower",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Torque: About 406 lb-ft",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))


                    Text(
                        text = "-Transmission: 6-speed manual transmission",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-M3 Competition:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Engine: 3.0-liter BMW M TwinPower Turbo inline 6-cylinder",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)

                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Power: Approximately 503 horsepower",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Torque: About 479 lb-ft",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Transmission: 8-speed M Steptronic automatic transmission",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-M3 Competition xDrive:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Engine: 3.0-liter BMW M TwinPower Turbo inline 6-cylinder",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)

                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Power: Approximately 503 horsepower",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Torque: About 479 lb-ft",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Transmission: 8-speed M Steptronic automatic transmission",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Drive System: BMW’s xDrive all-wheel drive system",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )


                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Design and Dimensions",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        color = Color.Red,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Curb Weight: Around 3,600 to 3,800 pounds (1,632 to 1,724 kilograms), depending on the configuration.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Length: Approximately 189.1 inches (4.80 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))


                    Text(
                        text = "-Width: About 74.3 inches (1.89 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Height: Around 56.4 inches (1.43 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Wheelbase: Approximately 112.5 inches (2.86 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Performance.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Top Speed: Approximately 155 mph (250 km/h) electronically limited, with an optional increase to 180 mph (290 km/h) with the M Driver’s Package.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-0-60 mph:",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Standard M3: Around 4.1 seconds",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-M3 Competition: Around 3.8 seconds",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-M3 Competition xDrive: Around 3.4 seconds",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Interior and Features:",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Seating: Typically accommodates 4 passengers with M-specific sports seats.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Infotainment System: BMW iDrive 7.0 or later, with a high-resolution display, navigation, Apple CarPlay, Android Auto, and Bluetooth connectivity.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Interior Trim: M-specific design elements, premium materials, and customizable options.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = " Suspension and Handling:",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Suspension: M-tuned adaptive M suspension with electronically controlled dampers.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Brakes: M Compound brakes with optional carbon-ceramic brakes.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Pricing:",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Base Model: Starting around Ksh 9,900,000",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-M3 Competition: Approximately Ksh 10,900,000",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-M3 Competition xDrive: Approximately Ksh 11,500,000",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Safety and Driver Assistance.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Features: Includes advanced safety systems such as Active Cruise Control, Lane Departure Warning, Blind Spot Detection, and more.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Driver Assistance Package: Available with additional features like Active Driving Assistant and Parking Assistant.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    val mContext= LocalContext.current
                    Button(
                        onClick = {
                            val callIntent= Intent(Intent.ACTION_DIAL)
                            callIntent.data="tel:0741512929".toUri()
                            mContext.startActivity(callIntent)
                        },
                        colors = ButtonDefaults.buttonColors(Color.Red),
                        shape = RoundedCornerShape(10.dp),
                        modifier = Modifier
                            .padding(start = 20.dp, end = 20.dp)
                            .fillMaxWidth()
                    ) {
                        Text(text = "Order Now")
                    }

                    Spacer(modifier = Modifier.height(120.dp))
                }
            }
        )
    }
}

@Composable
@Preview(showBackground = true)
fun BmwScreenPreview(){
    BmwScreen(rememberNavController())
}