package com.example.myapplication




class reservation {

    fun hotel()  {
        println("반갑습니다. 호텔 예약 프로그램입니다.")
        println("[메뉴]")
        println("1. 방예약 , 2. 예약목록 출력 , 3. 예약몰록 (정렬) 출력 , 4. 시스템 종료 , 5. 금액 입급-출금 내역 목록 출력 , 6. 예약 변경 / 취소")
        var Room = room()
        var Check = check()

}
    fun room() {
        var selec = readLine()!!.toInt()
        when (selec) {
            1 -> {
                while (true) {
                    try {
                        println("예약자분의 성함을 입력해주세요")
                        var name = readLine().toString()
                        println("예약할 방번호를 입력해주세요")
                        var roomnumber = readLine()!!.toInt()
                        if (roomnumber < 100) {
                            println("방번호는 100~999 이내 입니다.")
                            println("다시 입력해주세요")
                            return room()
                        } else if (roomnumber > 999) {
                            println("방번호는 100~999 이내 입니다.")
                            println("다시 입력해주세요")
                            return room()
                        }
                        break
                    } catch (e: Exception) {
                        println("다시 입력해주세요")
                    }
                }
            }
            4 -> {
                println("종료합니다. 감사합니다.")
            }
        }
    }

    fun check(){
        while (true){
            try {
                println("제크인 날짜를 입력해주세요")
                var check_in = readLine()!!.toInt()
                if (check_in<20230721){
                    println("체크인은 지난날은 선택할 수 업습니다.")
                    return check()
                }
                break
            }catch (e :Exception){
                println("다시 입력해주세요")
            }
        }
    }
}
