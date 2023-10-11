package com.example.bookshelfapp.data

import com.example.bookshelfapp.model.BookResponse
import com.example.bookshelfapp.network.ApiService

interface BookRepository {
    suspend fun getBooks(query: String): BookResponse
}

class DefaultBookRepository(
    private val apiService: ApiService
) : BookRepository {
    override suspend fun getBooks(query: String): BookResponse = apiService.getBooks(query)
}