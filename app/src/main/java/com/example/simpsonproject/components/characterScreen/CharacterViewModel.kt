package com.example.simpsonproject.components.characterScreen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.simpsonproject.remote.data.elementCharacterList
import com.example.simpsonproject.remote.request.RetrofitInstance
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch



class CharacterViewModel(): ViewModel() {


    private val _characterList = mutableStateOf<List<elementCharacterList>>(emptyList())
    var characterList: State<List<elementCharacterList>> = _characterList



    var pageNumber = 1;


    init {
        fetchCharacters()
    }

    fun fetchCharacters(){

        viewModelScope.launch {
            try{

                val response = RetrofitInstance.api.getListChararacters(pageNumber)

                _characterList.value = response.results

            }catch(e: Exception){

            }



        }

    }



}