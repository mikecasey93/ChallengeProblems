package com.example.challengeproblems.challenges

/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
fun moveZeros(list: List<Int>): List<Int> {
    // For a given list, return a new list with all the zero values moved to the end of the list.
    var newList = mutableListOf<Int>()
    var zeros = mutableListOf<Int>()
    for (i in list) {
        if (i != 0){
            newList.add(i)
        }
        else {
            zeros.add(i)
        }
    }
    return newList + zeros
}

fun main() {
    val nums = listOf<Int>(1,2,0,7,0,0,5,8,8,1,0)
    println(moveZeros(nums))
}