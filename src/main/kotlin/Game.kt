package org.example

class Game {
    val bassball = Bassball()

    fun guessYou(answer: String, your: String): String {

        if (bassball.strikeUmpire(answer, your) == 3) {

        }

        //if(ball==0) "" else "${ball}볼"
        //if(strike == 0){""} else if(strike == 3) {"정답입니다!"} else {"${strike}스트라이크"}

        return
    }
}