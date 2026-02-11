package com.cherkina.android_lab_5_cherkina

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.Group
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MainScreen()
        }
    }
}

@Composable
fun TitleBlock(){

}
@Composable
fun MainScreen(){

}
@Composable
fun ColorRow(){

}
@Composable
fun ColorBox(color: Color){

}
@Composable
fun CombinedBlock(){

}



//        class MainActivity1 : ComponentActivity() {
//            override fun onCreate(savedInstanceState: Bundle?) {
//                super.onCreate(savedInstanceState)
//                enableEdgeToEdge()
//                setContent {
//                    val symbols = "Hello world".filter { it.isLetter() }
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .padding(8.dp)
//                            .background(color = Color.Green),
//                        horizontalAlignment = Alignment.CenterHorizontally,
//                        verticalArrangement = Arrangement.SpaceEvenly
//                    ) {
//                        Row(
//                            modifier = Modifier.fillMaxWidth(),
//                            horizontalArrangement = Arrangement.SpaceEvenly
//                        ) {
//                            for (char in symbols) {
//                                Text(
//                                    text = char.toString(),
//                                    fontWeight = FontWeight.ExtraBold,
//                                    color = Color.Blue,
//                                    fontSize = 20.sp,
//                                    letterSpacing = 24.sp
//                                )
//                            }
//
//                        }
//                        Spacer(modifier = Modifier.height(16.dp))
//                        Row(
//                            modifier = Modifier.fillMaxWidth(),
//                            horizontalArrangement = Arrangement.SpaceEvenly
//                        ) {
//                            for (char in symbols.reversed()) {
//                                Text(
//                                    text = char.toString(),
//                                    fontWeight = FontWeight.ExtraBold,
//                                    color = Color.Red,
//                                    fontSize = 20.sp,
//                                    letterSpacing = 24.sp
//                                )
//                            }
//                        }
////            Column{
////                repeat(5) {
////                Text(
////                    modifier = Modifier
////                        .background(color = Color.Green)
////                        .padding(top = 48.dp, start = 16.dp, end = 16.dp)
////                        .width(100.dp),
////                    text = "Hello world",
////                    fontWeight = FontWeight.ExtraBold,
////                    color = Color.Blue,
////                    fontSize = 20.sp,
////                    letterSpacing = 24.sp
////                )
////            }
////            }
////        }
////    }
//                    }
//                }
//            }
//        }

//        class MainActivity2 : ComponentActivity() {
//            override fun onCreate(savedInstanceState: Bundle?) {
//                super.onCreate(savedInstanceState)
//                enableEdgeToEdge()
//                setContent {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxSize()
//                            .background(Color.White)
//                            .padding(16.dp),
//                        verticalArrangement = Arrangement.SpaceEvenly,
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Box(
//                            modifier = Modifier
//                                .size(100.dp)
//                                .background(Color(0xFFFF0000))
//                        )
//                        Box(
//                            modifier = Modifier
//                                .size(100.dp)
//                                .background(Color(0x80FF0000))
//                        )
//                    }
//
//                }
//            }
//        }
//    }
//}


//setContent {
//    Scaffold(
//        topBar = {
//            TopAppBar(
//                title = { Text(text = "Scaffold example") }
//            )
//        },
//        floatingActionButton = {
//            FloatingActionButton(onClick = { }) {
//                Text(text = "+")
//            }
//        }
//    ) { paddingValues ->
//        Column(
//            modifier = Modifier
//                .fillMaxSize()
//                .padding(paddingValues),
//            verticalArrangement = Arrangement.Center,
//            horizontalAlignment = Alignment.CenterHorizontally
//        ) {
//            Text(text = "Основное содержимое экрана")
//
//        }
//    }