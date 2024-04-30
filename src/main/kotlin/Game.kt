package org.example

class Game {
    val bassball = Bassball()

    fun guessYou(answer: String, your: String): String {
        val strike = bassball.strikeUmpire(answer, your)
        val ball = bassball.ballUmpire(answer, your)
        if (strike== 3) {
            return "정답입니다."
        } else if (strike == 0 && ball == 0) {
            return "Notting"
        } else {
            val msg1=if(strike == 0) "" else "${strike}스트라이크 "
            val msg2=if(ball==0) "" else "${ball}볼"
            return "${msg1}${msg2}"
        }
    }
}