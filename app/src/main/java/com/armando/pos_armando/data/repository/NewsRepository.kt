package com.armando.pos_armando.data.repository

import com.armando.pos_armando.data.model.ActionState
import com.armando.pos_armando.data.model.News
import com.armando.pos_armando.data.remote.NewsService
import com.armando.pos_armando.data.remote.RetrofitApi
import retrofit2.await
import java.lang.Exception

class NewsRepository {
    private val newsService: NewsService by lazy { RetrofitApi.newsService() }

    suspend fun listNews() : ActionState<List<News>>{
        return try {
            val list = newsService.listNews().await()
            ActionState(list.manga_list)
        } catch (e: Exception){
            ActionState( message = e.message, isSuccess = false)
        }
    }
    suspend fun detailNews(url:String):ActionState<News>{
        return  try {
            val list = newsService.detailNews(url).await()
            ActionState(list.manga_list.first())
        } catch (e:Exception){
            ActionState(message = e.message, isSuccess = false)
        }
    }

    suspend fun searchNews(query:String):ActionState<List<News>>{
        return try {
            val list = newsService.searchNews(query).await()
            ActionState(list.manga_list)
        } catch (e:Exception){
            ActionState(message = e.message,isSuccess = false)
        }
    }
}