package com.example.challengeproblems.challenges

//Bank Cards
///
//Banks
//
//ACME 1121
//ALFA 1111
//AMEX 3796
//
//Sample input
//-> 1121-0000-0000-0312  -- Expiry Date (03/12)
//-> First 4 digit represent company
//-> Last 4 digit represent expiry date
//
//Assuming card and date as input write a function to verify valid card numbers
//*/

fun validcards(cardNum: String): Boolean {
    var nums = cardNum.split("-")

    if (nums[0] != "1121" && nums[0] != "1111" && nums[0] != "3796"){
        println("Not 0")
        return false
    }

    val months = listOf("01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12")
    var month = cardNum.substring(15,17)

    if (month !in months) {
        println("Not 4")
        return false
    }

    var year = cardNum.substring(17,19)
    if (year.toInt() > 24) {
        return false
    }

    for (i in 4..14) {
        if (cardNum[i] == '-'){
            continue
        }
        else if(!cardNum[i].isDigit()){
            println("Not 5")
            return false
        }
    }
    return true
}

fun main() {
    println(validcards("1121-0000-0000-0312"))
}