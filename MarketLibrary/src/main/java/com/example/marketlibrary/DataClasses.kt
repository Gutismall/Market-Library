package com.example.marketlibrary

import android.location.Location
import java.util.Date

data class Post(
    val id: String,
    val title: String,
    val description: String,
    val price: Double,
    val images:List<String>?,
    val seller: User,
    val category: Category,
    val market: Market,
    val location: Location,
    val createdAt: Date
)

data class User(
    val id: String,
    val username: String,
    val avatarUrl: String?,
)

data class Category(
    val id: String,
    val name: String,
    val market: Market
)

data class Location(
    val city: String,
    val region: String,
    val country: String,
    val latitude: Double?,
    val longitude: Double?
)

data class ChatMessage(
    val id: String,
    val senderId: String,
    val receiverId: String,
    val postId: String,
    val message: String,
    val timestamp: Date
)

data class Market(
    val id:String,
    val name:String
)