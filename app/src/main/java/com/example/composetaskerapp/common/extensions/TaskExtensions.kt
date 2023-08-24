package com.example.composetaskerapp.common.extensions

import com.example.composetaskerapp.data.models.TaskCache
import com.example.composetaskerapp.domain.models.Task
import com.example.composetaskerapp.presentation.models.TaskUi

fun Task.mapToCache(): TaskCache {
    return TaskCache(
        id = id,
        time = time,
        title = title,
        date = date,
        categoryId = categoryId,
        categoryColor = categoryColor
    )
}

fun TaskCache.mapToTask(): Task {
    return Task(
        id = id,
        time = time,
        title = title,
        date = date,
        categoryId = categoryId,
        categoryColor = categoryColor
    )
}

fun Task.mapToTaskUi(): TaskUi {
    return TaskUi(
        id = id,
        time = time,
        title = title,
        date = date,
        categoryId = categoryId,
        categoryColor = categoryColor
    )
}
