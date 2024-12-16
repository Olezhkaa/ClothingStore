package com.example.clothingstore.Domain.UseCases.ProductsUseCases

import com.example.clothingstore.Domain.Model.Products
import com.example.clothingstore.Domain.Repository.ProductsRepository

class getProductByIdUseCases(private val productsRepository: ProductsRepository) {
    fun execute(productId: Int): Products {
        return productsRepository.getProductById(productId)
    }
}