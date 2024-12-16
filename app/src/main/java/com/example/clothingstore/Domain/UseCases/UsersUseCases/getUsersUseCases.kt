package com.example.clothingstore.Domain.UseCases.UsersUseCases

import com.example.clothingstore.Domain.Model.Users
import com.example.clothingstore.Domain.Repository.UsersRepository

class getUsersUseCases(private val usersRepository: UsersRepository) {
    fun execute() : List<Users>{
        return usersRepository.getUsers()
    }
}