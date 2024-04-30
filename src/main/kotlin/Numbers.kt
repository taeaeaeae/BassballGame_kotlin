package org.example

import inline.input
import inline.numCheck
import kotlin.random.Random

class Numbers {

    fun randomNum() : String{
        var num = "000"
        while(numCheck(num)) {
            num = Random.nextInt(102, 988).toString()
        }
        return num
    }

    fun inputNum() : String{
        var number = input("숫자를 입력하세요")
        while (!"\\d\\d\\d".toRegex().matches(number) || (number[0].equals("0") || numCheck(number))){
            println("올바르지 않은 입력값입니다")
            number = input("숫자를 입력하세요")
        }
        return number
    }

}