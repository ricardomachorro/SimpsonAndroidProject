package com.example.simpsonproject.remote.data

data class Character(
    val id: Int,
    val age: Int,
    val birthdate: String,
    val description: String,
    val first_appearance_ep_id:Int,
    val first_appearance_sh_id:Int,
    val gender: String,
    val name: String,
    val occupation: String,
    val pharses: List<String>,
    val portrait_path: String,
    val status: String,
    val first_appearance_ep: appearance_ep,
    val first_appearance_sh: appearance_sh
)


data class appearance_ep(
    val id: Int,
    val airdate: String,
    val description: String,
    val episode_number: String,
    val image_path:String,
    val name: String,
    val season: Int,
    val synopsis: String
)

data class appearance_sh(
    val id: Int,
    val airdate: String,
    val description: String,
    val episode_number: String,
    val image_path:String,
    val name: String,
    val season: Int,
    val synopsis: String
)
