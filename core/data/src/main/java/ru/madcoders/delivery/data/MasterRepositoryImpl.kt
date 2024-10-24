package ru.madcoders.delivery.data

import kotlinx.coroutines.flow.Flow
import ru.madcoders.delivery.domain.IMasterRepository

class MasterRepositoryImpl(
    /** insert here your repositoriesInterfaces
    *private val api: IApiRepository
    *private val db: IPrefsRepository
    *private val prefs: IDBRepository
     */
) : IMasterRepository {
    override suspend fun example() {
        TODO("Not yet implemented")
    }

    override fun example2(id: Long): Flow<Boolean> {
        TODO("Not yet implemented")
    }

    override fun example3(): Flow<List<String>> {
        TODO("Not yet implemented")
    }


}