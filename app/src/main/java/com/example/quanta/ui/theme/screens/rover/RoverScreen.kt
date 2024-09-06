package com.example.quanta.ui.theme.screens.rover

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

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RoverScreen(navController: NavController){
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
                            painter = painterResource(id = R.drawable.img_8),
                            contentDescription = "",
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(top = 60.dp)
                        )
                    }

                    Spacer(modifier = Modifier.height(30.dp))


                    Text(
                        text = "The Range Rover SV (Special Vehicle) is a high-performance, luxury SUV that represents the top tier of the Range Rover lineup. It offers a blend of luxury, technology, and performance. Here’s a comprehensive overview:",
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
                        text = "-Model: Range Rover SV",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Type: Full-size luxury SUV",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Introduction Year: The SV designation has been used for various iterations, with the current models debuting around 2022.",
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
                        text = "-Petrol Engine: 5.0-liter supercharged V8",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Power Output: Approximately 518 horsepower",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Torque: Around 625 Nm",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Hybrid Engine: Plug-in hybrid option available in some markets",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Combined Power Output: Up to 434 horsepower (varies by configuration)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)

                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Electric Range: Around 40 miles (64 km) on a full charge",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Transmission.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        color = Color.Red,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(start = 5.dp)
                    )
                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Type: 8-speed automatic transmission",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Drivetrain: Full-time four-wheel drive (4WD)",
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
                        text = "0-60 mph (0-100 km/h) Time: Approximately 4.5 to 5.0 seconds (varies by engine)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Top Speed: Around 155 mph (250 km/h)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Towing Capacity: Up to 3,500 kg (7,700 lbs)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Fuel Economy.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Petrol Engine: Around 15-18 mpg (combined) or 15-18 L/100 km",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Hybrid Engine: Combined fuel economy of around 40-50 mpg equivalent (depending on driving conditions and battery use)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Dimensions.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Length: Approximately 5,200 mm (204 inches)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Width: About 2,220 mm (87 inches)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Height: Around 1,850 mm (73 inches))",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Wheelbase: Approximately 3,120 mm (122 inches)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Ground Clearance: Adjustable air suspension with variable height settings",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Interior and Features.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Seating Capacity: 5 seats, with optional 4-seat configurations for more luxury",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Material: Premium leather, suede, and high-end materials; customization options available",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Infotainment System: Includes a large touchscreen (typically 13 inches), Apple CarPlay, Android Auto, and an advanced sound system (Meridian or similar)",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Climate Control: Four-zone automatic climate control",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Driver Assistance: Advanced driver aids including adaptive cruise control, lane-keeping assist, automatic emergency braking, and a 360-degree camera system",
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
                        text = "-Airbags: Multiple airbags including front, side, and curtain",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Crash Test Ratings: Generally high safety ratings from major safety organizations, but specifics can vary by market and model year",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Luxury and Customization.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-SV Autobiography Trim: Offers the ultimate in luxury with bespoke options, including custom leather interiors, unique color choices, and advanced comfort features",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-SV Dynamic Trim: Focuses on performance with sportier styling and enhancements",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Off-road Capability.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Terrain Management: Advanced off-road systems including multiple driving modes, terrain response systems, and air suspension with adjustable height",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-Differentials: Optional locking differentials for enhanced traction",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Pricing.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "-Base Price: Typically starts around Ksh 15,130,000 to Ksh 19,250,000 for the base SV model. Prices can escalate significantly with additional options and customizations.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(
                        text = "Trim Levels.",
                        fontWeight = FontWeight.ExtraBold,
                        fontSize = 25.sp,
                        textAlign = TextAlign.Center,
                        color = Color.Red
                    )

                    Spacer(modifier = Modifier.height(10.dp))

                    Text(
                        text = "SV Autobiography: Emphasizes luxury and comfort with premium materials and bespoke options.",
                        fontSize = 20.sp,
                        modifier = Modifier
                            .padding(start = 10.dp)
                    )
                    Spacer(modifier = Modifier.height(5.dp))

                    Text(
                        text = "-SV Dynamic: Focuses on sporty performance with enhanced handling and power.",
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
fun RoverScreenPreview() {
    RoverScreen(rememberNavController())
}