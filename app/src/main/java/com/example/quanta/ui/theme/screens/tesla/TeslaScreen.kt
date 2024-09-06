package com.example.quanta.ui.theme.screens.tesla

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
fun TeslaScreen(navController: NavController){
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
                            painter = painterResource(id = R.drawable.img_10),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 60.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))


                    Text(
                        text = "The Tesla Cybertruck is a highly anticipated electric vehicle known for its futuristic design and impressive specs. Here’s an overview of its key details:",
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
                        text = "-Model: Cybertruck",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Type: Electric Pickup Truck",
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
                        text = "Powertrain Options.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Single-Motor Rear-Wheel Drive (RWD):",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-0-60 mph: Approximately 6.5 seconds",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Top Speed: Around 110-120 mph (177-193 km/h)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Range: Estimated 250 miles (402 kilometers)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "- Dual-Motor All-Wheel Drive (AWD):",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-0-60 mph: Approximately 4.5 seconds",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)

                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Top Speed: Around 120-130 mph (193-209 km/h)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Range: Estimated 300 miles (483 kilometers)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Tri-Motor All-Wheel Drive (AWD):",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-0-60 mph: Under 3.0 seconds",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)

                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Top Speed: Around 130-140 mph (209-225 km/h)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Range: Estimated to exceed 500 miles on a full charge.",
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
                        text = "-Curb Weight: Estimated around 5,000 to 6,500 pounds (2,270 to 2,950 kilograms), depending on the configuration.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Body: Stainless steel exoskeleton with an angular design; impact-resistant armored glass.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Exterior Dimensions:",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Length: Approximately 231.7 inches (5.88 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Width: 79.8 inches (2.03 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Height: 75.0 inches (1.91 meters)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Performance and towing.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "Towing Capacity: Up to 14,000 pounds (6,350 kilograms) for the tri-motor version.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Payload Capacity: Estimated at around 3,500 pounds (1,588 kilograms).",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Technology and Features:",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Autopilot: Standard with advanced driver assistance features; Full Self-Driving (FSD) capability available as an upgrade.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Infotainment System: Large 17-inch touchscreen with Tesla’s interface, navigation, media, and connectivity features.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Connectivity: Over-the-air software updates, Wi-Fi, and cellular connectivity.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Interior and Cargo Space:",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Seating Capacity: Up to 6 passengers",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Interior Features: Large central touchscreen interface (17 inches), minimalist design, premium materials, optional panoramic roof.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Cargo Space:",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Vault (Bed): 6.5 feet (1.98 meters) long with an estimated 100 cubic feet (2.83 cubic meters) of storage.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Front Trunk (Frunk): Additional storage space in the front.",
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
                        text = "-Base Model: Starting around Ksh 6,100,000",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Mid-Level Model: Approximately Ksh 6,900,900",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-High-End Model: Around Ksh 7,500,000",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Safety.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Safety Features: Advanced safety systems including automatic emergency braking, collision avoidance, and more, with a focus on a robust structure designed to protect occupants.",
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
fun TeslaScreenPreview(){
    TeslaScreen(rememberNavController())
}