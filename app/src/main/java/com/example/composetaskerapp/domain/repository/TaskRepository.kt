package com.example.composetaskerapp.domain.repository

import com.example.composetaskerapp.domain.models.Task
import com.example.composetaskerapp.domain.models.TaskCategory
import kotlinx.coroutines.flow.Flow

interface TaskRepository {

    fun fetchAllTasksFlow(): Flow<List<Task>>

    fun fetchAllTaskCategories(): List<TaskCategory>

    fun fetchTasksByCategoryId(categoryId: String): List<Task>

    fun fetchTasksSizeByCategoryId(categoryId: String): Int

    fun fetchTaskById(taskId: String): Task

    fun fetchTaskCategoryById(categoryId: String): TaskCategory

    fun addNewTask(task: Task): Boolean

    fun updateTask(task: Task)

    fun removeTaskById(id: String)

    fun removeTasksByIds(ids: List<String>)
}