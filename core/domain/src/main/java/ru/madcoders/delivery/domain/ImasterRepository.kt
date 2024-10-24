package ru.madcoders.delivery.domain

import kotlinx.coroutines.flow.Flow

interface IMasterRepository {
    suspend fun example()

    fun example2(id: Long): Flow<Boolean>

    fun example3(): Flow<List<String>>
}