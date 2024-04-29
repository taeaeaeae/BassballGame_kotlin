package org.example

import kotlin.random.Random

class Bassball {


    //중복숫자없게 이거 추상화 될듯?
    fun check() : String{
        var answerNum : String = Random.nextInt(100, 999).toString()
        while(answerNum[0] == answerNum[1] || answerNum[0] == answerNum[2] || answerNum[2] == answerNum[1]) {
           answerNum = Random.nextInt(100, 999).toString()
        }
        return answerNum
    }


    // 몇볼인지 알려줘
    fun ballUmpire() {

    }

    // 몇 스트라이크야?
    fun strikeUmpire() {

    }

}