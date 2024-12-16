package com.example.clothingstore.Domain.UseCases.ProductsUseCases

import com.example.clothingstore.Domain.Model.Products
import com.example.clothingstore.Domain.Repository.ProductsRepository

class getProductsUseCases(private val productsRepository: ProductsRepository) {
    fun execute() : List<Products> {
        return productsRepository.getProducts()
    }

}