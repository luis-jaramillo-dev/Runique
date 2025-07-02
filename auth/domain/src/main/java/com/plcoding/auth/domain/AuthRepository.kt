package com.plcoding.auth.domain

import com.plcoding.core.domain.util.DataError
import com.plcoding.core.domain.util.EmptyDataResult

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyDataResult<DataError.Network>

    suspend fun logIn(email: String, password: String): EmptyDataResult<DataError.Network>
}
