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
            return if(strike == 0) "" else "${strike}스트라이크" + if(ball==0) "" else "${ball}볼"

        }
    }
}