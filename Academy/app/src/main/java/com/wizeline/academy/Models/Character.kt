package com.wizeline.academy.Models

data class Character constructor(
    val name: String,
    val description: String
)

object DataSource {
//    val allCharacters = listOf<Character>(
//        Character(name = "Pedro", description = "Juan")
//    )

    val allCharacters: List<Character>
        get() {
            val mutableList = mutableListOf<Character>()
            for(number in 1..20) {
                mutableList.add(number, Character(name = "Character $number", description = "Description for character $number"))
            }
            return mutableList
        }
}

