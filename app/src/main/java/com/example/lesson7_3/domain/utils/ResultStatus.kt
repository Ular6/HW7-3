package com.example.lesson7_3.domain.utils

sealed class ResultStatus<T> {

    class Loading<T> : ResultStatus<T>()
    class Success<T>(val data: T?) : ResultStatus<T>()
    class Error<T>(val message: String) : ResultStatus<T>()
}