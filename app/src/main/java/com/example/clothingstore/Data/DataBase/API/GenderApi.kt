package com.example.clothingstore.Data.DataBase.API

import com.example.clothingstore.Domain.Model.Gender
import retrofit2.Call
import retrofit2.http.*

interface GenderApi {
    @GET("api/genders/all")
    fun getAllGenders(): Call<List<Gender>>

    @POST("api/genders/add")
    fun addGender(@Body gender: Gender): Call<Gender>
}