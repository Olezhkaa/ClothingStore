package com.example.clothingstore.Domain.Model

class Products(
    val id: Long,
    val articleNumber: String,
    val title: String,
    val price: Double,
    val discount: Int,
    val idListPhoto: Int,
    val size: String,
    val composition: String,
    val color: String,
    val countryProduction: String,
    val productConfiguration: String,
    val featuresModel: String,
    val decorativeElement: String,
    val takingCareOfThings: String,
    val description: String,
    val evaluation: String
) {

}