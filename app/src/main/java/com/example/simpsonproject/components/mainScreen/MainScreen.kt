package com.example.simpsonproject.components.mainScreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun MainScreen(){

    val listaOpcciones = listOf("Characters","Episodes","Locations")

    Box(
        modifier = Modifier
            .background(Color(0xFFe0e637))
            .fillMaxSize()
    ){

        Column(
            modifier = Modifier
                .padding(16.dp)
        )
        {
            LazyRow (

            ){

                items( listaOpcciones){ it ->
                        Button(
                            onClick = {}
                        ){
                            Text(it)
                        }
                }
            }



        }



    }


}