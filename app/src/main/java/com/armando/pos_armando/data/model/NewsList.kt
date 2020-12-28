package com.armando.pos_armando.data.model

data class NewsList (
    val status: Boolean = false,
    val message: String = "",
    val manga_list : List<News> = arrayListOf()
)