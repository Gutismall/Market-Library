package com.example.marketlibrary.post

import com.example.marketlibrary.Post

interface PostRepository {

    suspend fun createPost(post: Post)
    suspend fun getAllPosts()
    suspend fun getPostById()
    suspend fun updatePost()
    suspend fun updatePartialPost()
    suspend fun deletePost()
}