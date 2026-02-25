package com.example.simpsonproject.components.mainScreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.simpsonproject.R
import com.example.simpsonproject.ui.theme.*


@Composable
fun MainScreen(){

    val listaOpcciones = listOf("Characters","Episodes","Locations")

    Box(
        modifier = Modifier
            .background(BackGroundColor)
            .fillMaxSize()

    ){

        Column(
            modifier = Modifier
                .padding(horizontal =25.dp, vertical = 75.dp)
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        )
        {
            LazyRow (
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(vertical = 10.dp),
                horizontalArrangement = Arrangement.Absolute.SpaceAround
            ){

                items( listaOpcciones){ it ->
                        Button(
                            colors = ButtonDefaults.buttonColors(
                                containerColor = MainColorButton, // Set the desired background color
                                contentColor = Color.Black),
                            onClick = {}
                        ){
                            Text(it)
                        }
                }
            }

            ElevatedCard(
                modifier = Modifier
                    .fillMaxWidth(),
                elevation = CardDefaults.cardElevation(
                    defaultElevation = 6.dp
                ),
            ){
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text("Welcome to the Simpson App where you can see all about the program",
                        fontSize = 20.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center)


                    Image(
                        modifier = Modifier
                            .padding(vertical = 80.dp)
                            .size(230.dp),
                        painter = painterResource(R.drawable.homer_simpson),
                        contentDescription = ""
                    )
                }



            }




        }



    }


}