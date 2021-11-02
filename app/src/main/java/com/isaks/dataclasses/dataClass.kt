package com.isaks.dataclasses

data class User ( val id: Long, var name : String)

fun main() {
    val user1 =User (1, "sakshi")
     val name = user1.name
    println(name)
    user1.name = "shivay"
    val user2 =User(1, "shivay")
    println(user1.equals(user2))
    (1..10).map { index -> User(index.toLong()," sakshi") }.forEach(::println)


}