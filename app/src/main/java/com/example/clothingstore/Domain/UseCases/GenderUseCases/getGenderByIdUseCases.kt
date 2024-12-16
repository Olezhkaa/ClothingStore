package com.example.clothingstore.Domain.UseCases.GenderUseCases

import com.example.clothingstore.Domain.Model.Gender
import com.example.clothingstore.Domain.Repository.GenderRepository

class getGenderByIdUseCases (private val genderRepository: GenderRepository) {
    fun execute(genderId: Int): Gender {
        return genderRepository.getGenderById(genderId)
    }
}