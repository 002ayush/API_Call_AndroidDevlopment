package com.example.apicalls

import retrofit2.Call
import retrofit2.http.GET
//This is Step 3 to make an Interface
interface APIinterface {
    @GET("products")
    fun getProductData() : Call<MyData>
}