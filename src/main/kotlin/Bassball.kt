package org.example

import kotlin.random.Random
import inline.numCheck

class Bassball {

    //중복숫자없게 이거 추상화 될듯? 아닌가?
    fun randomNum() : String{
        var num = "000"
        while(numCheck(num)) {
           num = Random.nextInt(100, 999).toString()
        }
        return num
    }

    // 몇볼인지 알려줘
    fun ballUmpire(answerNum : String, num : String) : Int {
        var ball = 0
        for(i in answerNum.indices){
            if(answerNum.contains(num[i]) && (answerNum[i]==num[i])) ball++
        }
        return ball
    }

    // 몇 스트라이크야?
    fun strikeUmpire(answerNum : String, num : String) : Int {
        var strike = 0
        for( i in answerNum.indices){
            if(answerNum[i] == num[i]) strike++
        }
        return strike
    }

}