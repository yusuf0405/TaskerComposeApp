package com.example.composetaskerapp.domain.usecases

import com.example.composetaskerapp.domain.repository.TaskRepository

class FetchTasksSizeByCategoryIdUseCase(
    private val repository: TaskRepository
) {

    operator fun invoke(categoryId: String): Int {
        return repository.fetchTasksSizeByCategoryId(categoryId)
    }
}