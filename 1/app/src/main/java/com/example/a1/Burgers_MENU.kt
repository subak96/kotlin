package com.example.a1

class Burgers_MENU : MENU() {

    fun Burgers(){
        while (true) {

        try {
            println(
                "[ Burgers MENU ]\n" +
                        "[1]ShackBurger    | W 6.9 |  토마토, 양상추, 쉑소스가 토핑된 치즈버거\n" +
                        "[2]SmokeShack     | W 8.9 |  베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거\n" +
                        "[3]Shroom Burger  | W 9.4 |  몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거\n" +
                        "[4]Cheeseburger   | W 6.9 |  포테이토 번과 비프패티, 치즈가 토핑된 치즈버거\n" +
                        "[5]Hamburger      | W 5.4 |  비프패티를 기반으로 야채가 들어간 기본버거\n" +
                        "[6]뒤로가기\n" +
                        "[0]종료"
            )
            var num2 = readLine()?.toInt()
            when (num2) {
                1 -> {
                    println("ShackBurger를 선택하셨습니다.")
                }

                2 -> {
                    println("SmokeShack를 선택하셨습니다")
                }

                3 -> {
                    println("Shroom Burger를 선택하셨습니다.")
                }

                4 -> {
                    println("Cheeseburger를 선택하셨습니다.")
                }

                5 -> {
                    println("Hamburger를 선택하셨습니다.")
                }

                6 -> {
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