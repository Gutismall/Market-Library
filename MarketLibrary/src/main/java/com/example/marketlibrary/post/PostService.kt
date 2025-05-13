package com.example.marketlibrary.post

import com.example.marketlibrary.Post
import okhttp3.Response
import retrofit2.http.*

interface PostService {

    @POST("posts")
    suspend fun createPost(@Body post: Post)

    @GET("posts")
    suspend fun getAllPosts(): List<Post>

    @GET("posts/{id}")
    suspend fun getPostById(@Path("id") id: String): Post

    @PUT("posts/{id}")
    suspend fun updatePost(@Path("id") id: String, @Body post: Post)

    @PATCH("posts/{id}")
    suspend fun updatePartialPost(@Path("id") id: String, @Body fields: Map<String, Any>)

    @DELETE("posts/{id}")
    suspend fun deletePost(@Path("id") id: String)
}