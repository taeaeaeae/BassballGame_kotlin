package org.example

import kotlin.random.Random
import inline.numCheck

class Bassball {


    // 몇볼인지 알려줘
    fun ballUmpire(answerNum : String, num : String) : Int {
        var ball = 0
        for(i in answerNum.indices){
            if(answerNum.contains(num[i]) && (answerNum[i]!=num[i])) ball++
        }
//        val massage = "${ball}볼"
        return ball
        //if(ball==0) "" else "${ball}볼"
    }

    // 몇 스트라이크야?
    fun strikeUmpire(answerNum : String, num : String) : Int {
        var strike = 0
        for( i in answerNum.indices){
            if(answerNum[i] == num[i]) strike++
        }
//        val massage = if(strike == 3) {"${strike}스트라이크"} else {"정답입니다!"}
        return strike
        //if(strike == 0){""} else if(strike == 3) {"정답입니다!"} else {"${strike}스트라이크"}
    }

}
