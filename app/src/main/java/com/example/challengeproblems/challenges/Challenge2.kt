package com.example.challengeproblems.challenges

/**
 * Given a string implement a function which returns longest word in that string.
 * If there are two or more words that have the same length, return the first longest word from the string.
 * Ignore punctuation. Input string can't be empty or blank string.
 */
fun findLongestWord(value: String): String {
    val splitWords = value.split("\\s".toRegex())
    var longest: String = ""
    var biggest: Int = 0
    for (element in splitWords) {
        if (element.length > biggest) {
            biggest = element.length
            longest = element
        }
    }
    return longest
}

fun main() {
    println(findLongestWord("hello  yes  days   awfullly eating"))
}