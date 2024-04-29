package org.example

import inline.input
import inline.numCheck
import kotlin.random.Random

fun main() {
    println("< 게임을 시작합니다 >")

    var num = ""

    while (numCheck(num)){
        input("숫자를 입력하세요")
    }


}