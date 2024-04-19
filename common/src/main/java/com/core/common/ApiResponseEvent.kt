package com.core.common

sealed class ApiResponseEvent<T>(val data: T? = null, val message: String? = null) {
    class Loading<T> : ApiResponseEvent<T>()

    class Success<T>(data: T) : ApiResponseEvent<T>(data = data)

    class Error<T>(message: String) : ApiResponseEvent<T>(message = message)
}
