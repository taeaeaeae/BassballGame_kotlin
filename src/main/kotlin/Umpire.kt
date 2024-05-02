package org.example

class Umpire {

    fun ballUmpire(answerNum : String, num : String) : Int {
        var ball = 0
        for(i in answerNum.indices){
            if(answerNum.contains(num[i]) && (answerNum[i]!=num[i])) ball++
        }
        return ball
    }

    fun strikeUmpire(answerNum : String, num : String) : Int {
        var strike = 0
        for( i in answerNum.indices){
            if(answerNum[i] == num[i]) strike++
        }
        return strike
    }
}
