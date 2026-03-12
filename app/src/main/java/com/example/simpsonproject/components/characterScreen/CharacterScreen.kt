package com.example.simpsonproject.components.characterScreen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.unit.dp
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.simpsonproject.remote.data.elementCharacterList



@Composable
fun CharacterScreen(){


    val viewModel: CharacterViewModel = viewModel()

     val characterList by viewModel.characterList


        LazyColumn (modifier = Modifier
            .padding(horizontal = 20.dp, vertical =30.dp)){

            items(characterList) {
                    element ->

                Card(
                    elevation= CardDefaults.cardElevation(8.dp),
                    shape= RoundedCornerShape(16.dp),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical =20.dp)
                ){
                    Column(
                        modifier = Modifier.padding(16.dp),
                    ){
                        Text("Name: ${element.name}")
                        Text("Age: ${element.age}")
                        Text("Gender: ${element.gender}")

                    }

                }


            }
        }




}