package org.example

class Game {

    fun start() {
        val num = Numbers()

        println("< 게임을 시작합니다 >")

        val answer = num.randomNum()
//        println(answer)

        var res = ""
        while (!res.equals("정답입니다!\n")) {
            res = guessYou(num.inputNum(), answer)
            println(res)
        }
    }

     private fun guessYou(answer: String, your: String): String {
         val umpire = Umpire()
         val strike = umpire.strikeUmpire(answer, your)
         val ball = umpire.ballUmpire(answer, your)

         if (strike== 3) {
             return "정답입니다!"
         } else if (strike == 0 && ball == 0) {
             return "Notting"
         } else {
             val msg1=if(strike == 0) "" else "${strike}스트라이크 "
             val msg2=if(ball==0) "" else "${ball}볼"
             return "${msg1}${msg2}\n"
         }
    }
}