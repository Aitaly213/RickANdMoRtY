package com.geektech.rickandmorty.data.network

import retrofit2.http.GET

interface ApiService {

    @GET
    fun getCharacter()
    
}