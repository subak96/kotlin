package com.example.a1

class Drinks_MENU : MENU() {
    fun Drinks() {

        while (true) {
            try {
                println(
                    "[ Drinks MENU ]\n" +
                            "[1]콜라       | W 2.0 |\n" +
                            "[2]사이다     | W 2.0 |\n" +
                            "[3]환타       | W 2.0 |\n" +
                            "[4]커피       | W 3.0 |\n" +
                            "[5]맥주       | W 4.0 |\n" +
                            "[5]뒤로가기\n" +
                            "[0]종료"
                )
                var num3 = readLine()?.toInt()
                when (num3) {
                    1 -> {
                        println("콜라를 선택하셨습니다.")
                    }

                    2 -> {
                        println("사이다를 선택하셨습니다")
                    }

                    3 -> {
                        println("환타를 선택하셨습니다.")
                    }

                    4 -> {
                        println("커피를 선택하셨습니다.")
                    }

                    5 -> {
                        return main()
                    }

                    else -> {
                        println("종료합니다.")
                    }
                }
                break
            } catch (e: NumberFormatException) {
                println("잘못 입력하셨습니다")
            }
        }
    }
}
