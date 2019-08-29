package dev.practice.data

data class UserInfo(val id: String, val country: String, val name: CustomName)

data class CustomName(val firstName: String, val lastName: String)