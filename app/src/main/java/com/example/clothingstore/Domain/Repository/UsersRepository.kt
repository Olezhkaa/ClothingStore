package com.example.clothingstore.Domain.Repository

import com.example.clothingstore.Domain.Model.Users

interface UsersRepository {
    fun userConfirmation(email: String, password: String): Boolean
    fun getUsers() : List<Users>
    fun userById(userId: Long): Users
    fun insertUser(user: Users)
    fun updateDataUser(user: Users)
    //fun deleteUser()
}