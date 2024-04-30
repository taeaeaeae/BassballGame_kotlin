package org.example

fun main() {
    println("< 게임을 시작합니다 >")
    val num = Numbers()
    val game = Game()



//    val number = num.inputNum()
    val answer = "195"

    var res = ""
    while (!res.equals("정답입니다.")) {

        res = game.guessYou(num.inputNum(), answer)
        println(res)

    }




}