package org.example

fun main() {
    println("< 게임을 시작합니다 >")
    val num = Numbers()
    val game = Game()



    val number = num.inputNum()
    val answer = "195"//num.randomNum()

    println(game.guessYou(number, answer))




}