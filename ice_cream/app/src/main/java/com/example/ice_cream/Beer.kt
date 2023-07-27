package com.example.ice_cream

class Beer : Item() {
    val BeerList :MutableList<Menu> = mutableListOf(
        Menu(1,"소주\t", 5000,"진로"),
        Menu(2,"맥주\t", 5000,"카스"),
        Menu(3,"생맥주",5500,"시원한 생맥주"),
        Menu(4,"하이볼",8000,"유행하는 얼그레이 하이볼"),
        Menu(5,"전통주",30000,"높은 도수의 전통주")
    )
    val selectedMenus: MutableList<Pair<Menu, String>> = mutableListOf()
    val cart = Cart

    override fun displayInfo() {
        println("[ Burger MENU ]")
        for (menu in BeerList) {
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
                                val selectedMenu = BeerList[choice - 1]
                                println("메뉴: ${selectedMenu.name}, 가격: ${selectedMenu.price}원, 설명: ${selectedMenu.introduce}")
                                selectedMenus.add(selectedMenu to "ShackBurger")
                                break
                            }

                            2 -> {
                                val selectedMenu = BeerList[choice - 1]
                                println("메뉴: ${selectedMenu.name}, 가격: ${selectedMenu.price}원, 설명: ${selectedMenu.introduce}")
                                selectedMenus.add(selectedMenu to "SmokeShack")
                                break
                            }

                            3 -> {
                                val selectedMenu = BeerList[choice - 1]
                                println("메뉴: ${selectedMenu.name}, 가격: ${selectedMenu.price}원, 설명: ${selectedMenu.introduce}")
                                selectedMenus.add(selectedMenu to "ShroomBurger")
                                break
                            }

                            4 -> {
                                val selectedMenu = BeerList[choice - 1]
                                println("메뉴: ${selectedMenu.name}, 가격: ${selectedMenu.price}원, 설명: ${selectedMenu.introduce}")
                                selectedMenus.add(selectedMenu to "Cheeseburger")
                                break
                            }

                            5 -> {
                                val selectedMenu = BeerList[choice - 1]
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

                            for ((index, menu) in BeerList.withIndex()) {
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