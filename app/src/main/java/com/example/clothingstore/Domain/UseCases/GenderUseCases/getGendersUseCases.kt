package com.example.clothingstore.Domain.UseCases.GenderUseCases

import com.example.clothingstore.Domain.Model.Gender
import com.example.clothingstore.Domain.Repository.GenderRepository

class getGendersUseCases(private val genderRepository: GenderRepository) {
    fun execute() : List<Gender> {
        return genderRepository.getGenders()
    }
}