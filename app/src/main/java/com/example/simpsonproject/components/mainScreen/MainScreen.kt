package com.example.simpsonproject.components.mainScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
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
                .padding(top =75.dp, bottom = 75.dp)
                .fillMaxSize()
        )
        {
            LazyRow (
               modifier = Modifier
                   .fillMaxWidth(),
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



        }



    }


}