package com.example.tmobileappkotlin.presenter

import com.example.tmobileappkotlin.model.DataModel
import retrofit2.Call
import retrofit2.http.GET

interface RestApi {
    // Base Url https://private-8ce77c-tmobiletest.apiary-mock.com
    // End Point /test/home
    @GET("/test/home")
    fun getMeInfo(): Call<DataModel> // Exposes Asynchronous execution
}