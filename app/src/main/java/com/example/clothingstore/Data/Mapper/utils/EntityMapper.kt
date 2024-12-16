package com.example.clothingstore.Data.Mapper.utils

interface EntityMapper<Entity, DomainModel> {
    public fun mapFromEntity(entity: Entity) : DomainModel
    public fun mapToEntity(domainModel: DomainModel) : Entity

    public fun fromEntityList(initial: List<Entity>): List<DomainModel> {
        return initial.map {mapFromEntity(it)}
    }
    public fun toEntityList(initial: List<DomainModel>): List<Entity> {
        return initial.map {mapToEntity(it)}
    }
}