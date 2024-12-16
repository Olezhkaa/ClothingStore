package com.example.clothingstore.Domain.UseCases.UsersUseCases

import com.example.clothingstore.Domain.Model.Users
import com.example.clothingstore.Domain.Repository.UsersRepository

class userByIdUseCases(private val usersRepository: UsersRepository) {
    fun execute(userId: Long) : Users {
        return usersRepository.userById(userId)
    }

}