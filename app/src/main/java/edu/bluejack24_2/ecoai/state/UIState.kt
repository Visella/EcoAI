package edu.bluejack24_2.ecoai.state

sealed class UiState<out T> {
    object Loading : UiState<Nothing>()
    data class Success<T>(val data: T) : UiState<T>()
    data class Error(val message: String) : UiState<Nothing>()
    object Idle : UiState<Nothing>()
}
