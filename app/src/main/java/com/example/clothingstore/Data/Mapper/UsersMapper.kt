package com.example.clothingstore.Data.Mapper

import com.example.clothingstore.Data.DataBase.Entities.GenderEntity
import com.example.clothingstore.Data.DataBase.Entities.UsersEntity

import com.example.clothingstore.Data.Mapper.utils.EntityMapper
import com.example.clothingstore.Domain.Model.Users

/*class UsersMapper: EntityMapper<UsersEntity, Users> {

   public override fun mapFromEntity(entity: UsersEntity): Users {
        return Users(
            id = entity.id.toString().toLong(),
            surname = entity.surname,
            name = entity.name,
            patronymic = entity.patronymic,
            password = entity.password,
            dateOfBirth = entity.dateOfBirth,
            idGender = entity.idGender.toString().toInt(),
            photo = entity.photo,
            walletBalance = entity.walletBalance,
            amountSpent = entity.amountSpent,
            telephoneNumber = entity.telephoneNumber,
            email = entity.email
        )
    }

    public override fun mapToEntity(domainModel: Users): UsersEntity {
        return UsersEntity.new(domainModel.id) {
            surname = domainModel.surname
            name = domainModel.name
            patronymic = domainModel.patronymic
            password = domainModel.password
            dateOfBirth = domainModel.dateOfBirth
            idGender = GenderEntity.get(domainModel.idGender)
            photo = domainModel.photo
            walletBalance = domainModel.walletBalance
            amountSpent = domainModel.amountSpent
            telephoneNumber = domainModel.telephoneNumber
            email = domainModel.email
        }
    }
}*/