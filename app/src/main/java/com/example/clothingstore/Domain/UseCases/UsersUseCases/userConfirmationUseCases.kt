package com.example.clothingstore.Domain.UseCases.UsersUseCases

import com.example.clothingstore.Domain.Model.Users
import com.example.clothingstore.Domain.Repository.UsersRepository

class userConfirmationUseCases(private val usersRepository: UsersRepository) {
    fun execute(email: String, password: String) : Boolean{
        return usersRepository.userConfirmation(email, password)
    }
}