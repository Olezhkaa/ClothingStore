package com.example.clothingstore.Domain.UseCases.UsersUseCases

import com.example.clothingstore.Domain.Model.Users
import com.example.clothingstore.Domain.Repository.UsersRepository

class insertUserUseCases(private val usersRepository: UsersRepository) {
    fun execute(user: Users) {
        usersRepository.insertUser(user)
    }
}