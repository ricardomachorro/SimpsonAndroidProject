package com.example.simpsonproject.remote.request

import com.example.simpsonproject.remote.data.Character
import com.example.simpsonproject.remote.data.characterListResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("characters/{id}")
    suspend fun getCharacter(@Path ("id") idCharacter:Int): Response<Character>


    @GET("characters")
    suspend fun getListChararacters(@Query("page") currentPage: Int): Response<characterListResponse>

}