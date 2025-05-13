package com.example.marketlibrary.post

import com.example.marketlibrary.Post

class PostRepositoryImpl (
    private val api: PostService
): PostRepository{
    override suspend fun createPost(post: Post) {
        TODO("Not yet implemented")
    }

    override suspend fun getAllPosts() {
        TODO("Not yet implemented")
    }

    override suspend fun getPostById() {
        TODO("Not yet implemented")
    }

    override suspend fun updatePost() {
        TODO("Not yet implemented")
    }

    override suspend fun updatePartialPost() {
        TODO("Not yet implemented")
    }

    override suspend fun deletePost() {
        TODO("Not yet implemented")
    }
}