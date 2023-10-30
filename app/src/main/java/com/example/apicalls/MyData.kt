package com.example.apicalls
//This is step 2 and this is also called "POZO" class.
data class MyData(
    val limit: Int,
    val products: List<Product>,
    val skip: Int,
    val total: Int
)