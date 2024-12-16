package com.example.clothingstore.Domain.Repository

import com.example.clothingstore.Domain.Model.Products

interface ProductsRepository {

    fun getProducts(): List<Products>
    fun getProductById(productId: Int): Products
    //fun insertProduct(product: Products)
    //fun deleteProduct(product: Products)
}