package com.example.a1

class Forzen_Custard_MENU : MENU() {
    fun Forzen_Custard() {
        while (true) {
            try {
                println(
                    "[ Forzen Custard MENU ]\n" +
                            "[1]소프트 콘          |W 2.0|\n" +
                            "[2]쉐이크            |W 4.5|\n" +
                            "[3]구슬아이스크림      |W 5.0|\n" +
                            "[4]젤라또            |W 4.5|\n" +
                            "[5]뒤로가기\n" +
                            "[0]종료"
                )
                var choice = readLine()?.toInt()
                when (choice) {
                    1 -> {
                        println("${soft_menu().Soft()}")
                    }

                    2 -> {
                        println("${shake_menu().Shake()}")
                    }

                    3 -> {
                        println("${bead_menu().Bead()}")

                    }

                    4 -> {
                        println("${gelato_menu().Gelato()}")

                    }

                    5 -> {
                        return main()
                    }

                    0 -> {
                        println("종료합니다.")
                    }
                    else -> {
                        println("잘못 입력하셨습니다.")
                        return Forzen_Custard()
                    }
                }
                break
            } catch (e: NumberFormatException) {
                println("잘못 입력하셨습니다.")
            }
        }
    }
    class soft_menu {
        fun Soft() {
            while (true) {
                try {
                    println(
                        "어떤 맛을 고르시겠습니까?\n" +
                                "[1]초코\n[2]바닐라\n[3]딸기\n[4]자두\n[5]뒤로가기"
                    )
                    var soft = readLine()?.toInt()
                    when (soft) {
                        1 -> {
                            println("초코맛을 선택하셨습니다.")
                        }

                        2 -> {
                            println("바닐라맛을 선택하셨습니다.")
                        }

                        3 -> {
                            println("딸기맛을 선택하셨습니다.")
                        }

                        4 -> {
                            println("자두맛을 선택하셨습니다.")
                        }

                        5 -> {
                            return Forzen_Custard_MENU().Forzen_Custard()
                        }
                        else -> {
                            println("잘못 입력하셨습니다.")
                            return Soft()
                        }
                    }
                    break
                }catch (e : NumberFormatException){
                    println("잘못 입력하셨습니다.")
                }
            }
        }
    }

    class shake_menu{
        fun Shake() {
            while (true){
                try {
                    println(
                        "어떤 맛을 고르시겠습니까?\n" +
                                "[1]초코\n[2]바닐라\n[3]딸기\n[4]커피\n[5]뒤로가기"
                    )
                    var shake = readLine()?.toInt()
                    when (shake) {
                        1 -> {
                            println("초코맛을 선택하셨습니다.")
                        }

                        2 -> {
                            println("바닐라맛을 선택하셨습니다.")
                        }

                        3 -> {
                            println("딸기맛을 선택하셨습니다.")
                        }

                        4 -> {
                            println("커피맛을 선택하셨습니다.")
                        }

                        5 -> {
                            return Forzen_Custard_MENU().Forzen_Custard()
                        }
                        else ->{
                            println("잘못 입력하셨습니다.")
                            return Shake()
                        }
                    }
                    break
                }catch (e :NumberFormatException){
                    println("잘못 입력하셨습니다.")
                }
        }
    }
    }

    class bead_menu{
        fun Bead() {
            while (true) {
                try {
                    println(
                        "어떤 맛을 고르시겠습니까?\n" +
                                "[1]초코\n[2]바닐라\n[3]딸기\n[4]초코＆바닐라\n[5]뒤로가기"
                    )
                    var bead = readLine()?.toInt()
                    when (bead) {
                        1 -> {
                            println("초코맛을 선택하셨습니다.")
                        }

                        2 -> {
                            println("바닐라맛을 선택하셨습니다.")
                        }

                        3 -> {
                            println("딸기맛을 선택하셨습니다.")
                        }

                        4 -> {
                            println("초코＆바닐라을 선택하셨습니다.")
                        }

                        5 -> {
                            return Forzen_Custard_MENU().Forzen_Custard()
                        }
                        else -> {
                            println("잘못 입력하셨습니다.")
                            return Bead()
                        }
                    }
                    break
                } catch (e : NumberFormatException){
                    println("잘못 입력하셨습니다.")
                }
            }
        }
    }
    class gelato_menu {
        fun Gelato() {
            while (true) {
                try {
                    println(
                        "어떤 맛을 고르시겠습니까?\n" +
                                "[1]초코\n[2]바닐라\n[3]딸기\n[4]땅콩\n[5]뒤로가기"
                    )
                    var gelato = readLine()?.toInt()
                    when (gelato) {
                        1 -> {
                            println("초코맛을 선택하셨습니다.")
                        }

                        2 -> {
                            println("바닐라맛을 선택하셨습니다.")
                        }

                        3 -> {
                            println("딸기맛을 선택하셨습니다.")
                        }

                        4 -> {
                            println("땅콩을 선택하셨습니다.")
                        }

                        5 -> {
                            return Forzen_Custard_MENU().Forzen_Custard()
                        }

                        else -> {
                            println("잘못 입력하셨습니다.")
                            return Gelato()
                        }
                    }
                    break
                }catch (e:NumberFormatException){
                    println("잘못입력하셨습니다.")
                }
            }
        }
    }
    }
