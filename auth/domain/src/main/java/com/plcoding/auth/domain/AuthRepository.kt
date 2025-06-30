package com.plcoding.auth.domain

import com.plcoding.core.domain.util.EmptyDataResult
import com.plcoding.core.domain.util.DataError

interface AuthRepository {
    suspend fun register(email: String, password: String): EmptyDataResult<DataError.Network>
}