package com.example.clothingstore.Data.DataBase.Exposed

import com.example.clothingstore.Data.DataBase.Entities.GenderEntity
import com.example.clothingstore.Data.DataBase.Entities.UsersEntity
import com.example.clothingstore.Data.DataBase.Tables.UsersTable
import com.example.clothingstore.Domain.Model.Users



class UsersExposed{

     fun insert(user: UsersEntity) {

    }

     fun update(user: UsersEntity) {

    }



    /*private fun ResultRow.toUsers(): Users {
        return Users(this[UsersTable.id].toString().toLong(), this[UsersTable.surname], this[UsersTable.name], this[UsersTable.patronymic]
            ,this[UsersTable.password], this[UsersTable.dateOfBirth]!!, this[UsersTable.idGender].toString().toInt(), this[UsersTable.photo]!!
            ,this[UsersTable.walletBalance]!!.toInt(), this[UsersTable.amountSpent]!!.toInt(), this[UsersTable.telephoneNumber], this[UsersTable.email]
            )
    }*/
}