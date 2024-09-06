package com.example.quanta.ui.theme.screens.defender

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
fun DefenderScreen(navController: NavController){
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
                            painter = painterResource(id = R.drawable.img_12),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 60.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))


                    Text(
                        text = "The Land Rover Defender is a renowned off-road vehicle known for its rugged capabilities and distinctive design. Here’s a detailed overview of the latest model, which is part of the Defender 90 and Defender 110 series introduced in recent years:",
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
                        text = "-Land Rover Defender (L663)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Type: L663",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Introduction Year: 2020 (Expected)",
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
                        text = "-Standard Engines",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-2.0-liter P300 Inline-4:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Power: Approximately 296 horsepower",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Torque: About 295 lb-ft",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-3.0-liter P400 Inline-6 (Mild Hybrid):",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Power: Approximately 395 horsepower",
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
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Plug-In Hybrid (PHEV):",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-2.0-liter P400e Inline-4:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Power: Approximately 396 horsepower(combined)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Torque: About 472 lb-ft(combined)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Electric Range: Approximately 30 miles (48 kilometers) on electric power alone.",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "-Transmission:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-8-Speed Automatic Transmission: All models come with an 8-speed automatic transmission, providing smooth and efficient power delivery.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)

                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Dimensions",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        color = Color.Red,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Defender 90:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Length: Approximately 177.0 inches (4.50 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))


                    Text(
                        text = "-Width: About 79.1 inches (2.01 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Height: Around 77.5 inches (1.97 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Defender 110:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Length: Approximately 197.6 inches (5.02 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))


                    Text(
                        text = "-Width: About 79.1 inches (2.01 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Height: Around 77.5 inches (1.97 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Wheelbase:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Defender 90: About 101.9 inches (2.59 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))


                    Text(
                        text = "-Defender 110: About 119.0 inches (3.02 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Curb Weight: Ranges from approximately 4,000 to 5,000 pounds (1,814 to 2,268 kilograms), depending on the engine and configuration.",
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
                        text = "-0-60 mph:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-P300: Approximately 7.7 seconds",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-P400: Approximately 6.1 seconds",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-PHEV: Approximately 5.9 seconds",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Top Speed: Approximately 130 mph (209 km/h) for the higher performance models.",
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
                        text = "Seating Capacity:",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Defender 90: Typically 2+2 or 2+3 seating arrangement",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Defender 110: Up to 5+2 seating arrangement",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Interior Features: High-quality materials, modern infotainment system with a 10-inch touchscreen, Apple CarPlay, Android Auto, and a variety of off-road and comfort options.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Cargo Space: Varies depending on the configuration, with ample room for gear and equipment.",
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
                        text = "-Suspension: Air suspension available for adjustable ride height, adaptive dynamics, and terrain response systems.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Off-Road Capability: Advanced off-road features including Terrain Response 2, All-Terrain Progress Control, and a robust 4WD system.",
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
                        text = "-Base Model Defender 90: Starting around Ksh 9,956,000",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Base Model Defender 110: Starting around Ksh 10,600,000",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Higher Trim Levels and PHEV Models: Pricing can exceed Ksh 12,000,000, depending on options and configurations.",
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
                        text = "-Features: Includes a range of safety and driver assistance technologies such as Emergency Braking, Lane Keep Assist, Adaptive Cruise Control, and a 360-degree camera system.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Driver Assistance Package: Available with additional features and enhancements.",
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
fun DefenderScreenPreview(){
    DefenderScreen(rememberNavController())
}