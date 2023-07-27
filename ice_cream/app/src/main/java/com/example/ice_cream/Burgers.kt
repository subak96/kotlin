package com.example.ice_cream

class Burgers : Item() {
    val burgerList: MutableList<Menu> = mutableListOf(
        Menu(1, "ShackBurger\t", 6900, "토마토, 양상추, 쉑소스가 토핑된 치즈버거"),
        Menu(2, "SmokeShack\t", 8900, "베이컨, 체리 페퍼에 쉑소스가 토핑된 치즈버거"),
        Menu(3, "ShroomBurger", 9400, "베이컨, 몬스터 치즈와 체다 치즈로 속을 채운 베지테리안 버거"),
        Menu(4, "Cheeseburger", 6900, "포테이토 번과 비프패티, 치즈가 토핑된 치즈버거"),
        Menu(5, "Hamburger\t", 5400, "비프패티를 기반으로 야채가 들어간 기본버거")
    )

    val selectedMenus: MutableList<Pair<Menu, String>> = mutableListOf()
    val cart = Cart

    override fun displayInfo() {
        println("[ Burger MENU ]")
        for (menu in burgerList) {
            println(
                "[${menu.num}] ${menu.name}  ${menu.price}  ${menu.introduce}"
            )
        }
        println("[0] 뒤로가기")
    }

    override fun function() {
        first@ while (true) {
            try {
                val choice = readLine()?.toInt()

                while (true) {
                    try {


                        when (choice) {

                            1 -> {
                                val selectedMenu = burgerList[choice - 1]
                                println("메뉴: ${selectedMenu.name}, 가격: ${selectedMenu.price}원, 설명: ${selectedMenu.introduce}")
                                selectedMenus.add(selectedMenu to "ShackBurger")
                                break
                            }

                            2 -> {
                                val selectedMenu = burgerList[choice - 1]
                                println("메뉴: ${selectedMenu.name}, 가격: ${selectedMenu.price}원, 설명: ${selectedMenu.introduce}")
                                selectedMenus.add(selectedMenu to "SmokeShack")
                                break
                            }

                            3 -> {
                                val selectedMenu = burgerList[choice - 1]
                                println("메뉴: ${selectedMenu.name}, 가격: ${selectedMenu.price}원, 설명: ${selectedMenu.introduce}")
                                selectedMenus.add(selectedMenu to "ShroomBurger")
                                break
                            }

                            4 -> {
                                val selectedMenu = burgerList[choice - 1]
                                println("메뉴: ${selectedMenu.name}, 가격: ${selectedMenu.price}원, 설명: ${selectedMenu.introduce}")
                                selectedMenus.add(selectedMenu to "Cheeseburger")
                                break
                            }

                            5 -> {
                                val selectedMenu = burgerList[choice - 1]
                                println("메뉴: ${selectedMenu.name}, 가격: ${selectedMenu.price}원, 설명: ${selectedMenu.introduce}")
                                selectedMenus.add(selectedMenu to "Hamburger")
                                break
                            }

                            0 -> {
                                return main()
                            }

                            else -> {
                                println("다시 입력해주세요.")
                                displayInfo()
                                continue@first
                            }
                        }
                    } catch (e: Exception) {
                        println("다시 입력해주세요.")
                        displayInfo()
                        continue@first
                    }
                }
                third@ while (true) {
                    try {

                        println("다른 메뉴도 선택하시겠습니까? ([1] 네       [2] 아니요)")
                        val anotherChoice = readLine()?.toInt()
                        if (anotherChoice == 1) {
                            println("[ Burger MENU ]")

                            for ((index, menu) in burgerList.withIndex()) {
                                println(
                                    "[${index + 1}] ${menu.name} ${menu.price} ${menu.introduce}"
                                )
                            }
                            println("[0] 뒤로가기")
                            break
                        } else if (anotherChoice == 2) {
                            for ((menu, flavor) in selectedMenus) {
                                println("메뉴: ${menu.name}, 가격: ${menu.price}원, 설명: ${menu.introduce}, 맛: $flavor")
                            }

                            fourth@ while (true) {
                                println("위 메뉴를 장바구니에 추가하시겠습니까?")
                                println("[1]확인                     [2]취소")
                                try {
                                    val selec = readLine()?.toInt()
                                    if (selec == 1) {

                                        for ((menu) in selectedMenus) {
                                            cart.addmenus((menu))
                                        }
                                        println("메뉴가 장바구니에 추가되었습니다.\n")

                                        println("장바구니 목록")
                                        for (cart in cart.menus) {
                                            println("${cart.name} ${cart.price} ${cart.introduce}\n")
                                        }
                                        return main()
                                    } else if (selec == 2) {
                                        return main()
                                    } else {
                                        println("잘못 입력하셨습니다.")

                                        continue@fourth
                                    }

                                } catch (e: Exception) {
                                    println("잘못 입력하셨습니다.")

                                    continue@fourth
                                }
                            }
                        } else if (anotherChoice == 0)
                        else {
                            println("잘못 입력하셨습니다 1 또는 2를 입력하세요.")
                            continue@third
                            function()
                        }
                    }catch (e:Exception){
                        println("잘못입력하셨습니다.")
                    }
                }
            }catch (e :Exception){
                println("잘못입력하셨습니다.")
                displayInfo()
            }
        }
    }
}