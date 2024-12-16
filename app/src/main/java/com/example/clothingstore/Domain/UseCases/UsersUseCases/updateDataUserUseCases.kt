package com.example.clothingstore.Domain.UseCases.UsersUseCases

import com.example.clothingstore.Domain.Model.Users
import com.example.clothingstore.Domain.Repository.UsersRepository

class updateDataUserUseCases(private val usersRepository: UsersRepository) {
    fun execute(user: Users) {
        usersRepository.updateDataUser(user)
    }
}