package com.example.clothingstore.Data.Repository

import com.example.clothingstore.Data.DataBase.AppDataBase

import com.example.clothingstore.Data.DataBase.Exposed.UsersExposed
import com.example.clothingstore.Domain.Model.Users
import com.example.clothingstore.Domain.Repository.UsersRepository

/*class UsersRepositoryImpl : UsersRepository {

    private val UsersExposed = UsersExposed()

    override fun userConfirmation(email: String, password: String): Boolean {
        return UsersExposed.userConfirmation(email, password)
    }

    override fun getUsers(): List<Users> {
        return UsersMapper().fromEntityList(UsersExposed.getAll())
    }

    override fun userById(userId: Long): Users {
        return UsersMapper().mapFromEntity(UsersExposed.get(userId))
    }

    override fun insertUser(user: Users) {
        return UsersExposed.insert(UsersMapper().mapToEntity(user))
    }

    override fun updateDataUser(user: Users) {
        return UsersExposed.update(UsersMapper().mapToEntity(user))
    }
}*/