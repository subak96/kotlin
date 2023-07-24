package com.example.a1

open class MENU {
    fun menus() {
        while (true) try {
            println(
                "메뉴를 선택해 주세요\n" +
                        "[1]Burgers MENU\n" +
                        "[2]Drinks\n" +
                        "[3]Forzen Custard\n" +
                        "[4]Beer\n" +
                        "[0]종료"
            )
            var choice = readLine()?.toInt()
            when (choice) {
                1 -> {
                    println("${Burgers_MENU().Burgers()}")
                }
                2 -> {
                    println("${Drinks_MENU().Drinks()}")
                }
                3 ->{
                    println("${Forzen_Custard_MENU().Forzen_Custard()}")
                }
            }
            break
        } catch (e: NumberFormatException) {
            println("잘못 입력하셨습니다.")
        }
    }
}