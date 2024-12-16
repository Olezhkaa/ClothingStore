package com.example.clothingstore.Domain.Repository

import com.example.clothingstore.Domain.Model.Gender

interface GenderRepository {
    fun getGenders(): List<Gender>
    fun getGenderById(genderId: Int): Gender
}