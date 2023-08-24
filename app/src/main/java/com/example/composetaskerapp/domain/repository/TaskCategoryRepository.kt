package com.example.composetaskerapp.domain.repository

import com.example.composetaskerapp.domain.models.TaskCategory
import kotlinx.coroutines.flow.Flow

interface TaskCategoryRepository {

    fun addTaskCategory(taskCategory: TaskCategory)

    fun deleteTaskCategoryById(id: String)

    fun fetchAllTaskCategoriesFlow(): Flow<List<TaskCategory>>

    fun fetchTaskCategoryById(id: String): TaskCategory
}