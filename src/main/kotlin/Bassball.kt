package org.example

import inline.numCheck
import kotlin.random.Random

class Bassball {


    //중복숫자없게 이거 추상화 될듯?
    fun check() : String{
        var answerNum : String = Random.nextInt(100, 999).toString()
        while(numCheck(answerNum)) {
           answerNum = Random.nextInt(100, 999).toString()
        }
        return answerNum
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