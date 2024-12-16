package com.example.clothingstore.Domain.Model

import java.util.UUID

class Users(
    val id: Long,
    val surname: String,
    val name: String,
    val patronymic: String,
    val password: String,
    val dateOfBirth: String,
    val idGender: Int,
    val photo: String,
    val walletBalance: Int,
    val amountSpent: Int,
    val telephoneNumber: String,
    val email: String
) {
}