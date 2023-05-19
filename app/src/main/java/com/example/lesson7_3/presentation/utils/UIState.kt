package com.example.lesson7_3.presentation.utils

sealed class UIState<T> {
    class Loading<T> : UIState<T>()
    class Success<T>(data: T) : UIState<T>()
    class Error<T>(msg: String) : UIState<T>()
    class Empty<T> : UIState<T>()
}
