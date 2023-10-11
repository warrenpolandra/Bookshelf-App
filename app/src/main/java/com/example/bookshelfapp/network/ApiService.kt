package com.example.bookshelfapp.network

import com.example.bookshelfapp.model.BookResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("volumes")
    suspend fun getBooks(@Query("q") q: String): BookResponse
}