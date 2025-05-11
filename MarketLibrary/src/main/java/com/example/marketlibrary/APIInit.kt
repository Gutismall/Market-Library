package com.example.marketlibrary

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor

object APIInit {
    private const val BASE_URL = ""

    private val logger = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val client = OkHttpClient.Builder()
        .addInterceptor(logger)
        .build()
}