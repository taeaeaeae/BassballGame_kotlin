package org.example

class GameMachine {
    val game = Game()

    fun gogo()  {
        var toggle = 0
        var gameCount = 0
        val history = mutableListOf<Int>()

        while (toggle != 3) {
            println("\n환영합니다! 원하시는 번호를 입력해주세요.")
            try{
                println("1. 게임 시작하기 2. 게임 기록 보기 3. 종료하기")
                toggle = readln()!!.toInt()
            }
            catch(e: NumberFormatException){
                println("숫자를 입력해주면 좋겠어")
            }


            when (toggle) {
                1 -> {
                    gameCount = game.start()
                    history.add(gameCount)
                }
                2 -> {
                    println("< 게임 기록 보기 >")
                    for (i in history.indices) {
                        println("${i + 1}번째 게임 : 시도 횟수 - ${history[i]}")
                    }
                }
                3 -> {
                    println("< 숫자 야구 게임을 종료합니다 >")
                    break
                }
                else -> println("메뉴에 있는 숫자만 골라줘")
            }
        }
    }
}