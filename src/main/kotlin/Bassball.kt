package org.example

import kotlin.random.Random
import inline.numCheck

class Bassball {


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
