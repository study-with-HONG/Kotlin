fun main(args: Array<String>) {
    /*  주먹(0) 가위(1) 보(2) 게임
        - computer와 user의 대결
        - computer는 랜덤으로 내고, user는 입력받기
        - x무, y승, z패 -> 5판 하고 다시 할 건지 끝낼건지 묻기
    */
    var computer:Int
    var user:Int
    var win:Int
    var lose:Int
    var tie:Int
    var reply:Int // 마지막에서 게임 재시작 선택에 사용
    win = 0.also{ lose = it }.also { tie = it } // 무, 승, 패 0으로 초기화

    while (true){
        println("가위 바위 보 게임을 시작합니다.")

        for(i in 1 .. 5){ // 게임 5번 반복
            while(true){
                println("주먹(0) 가위(1) 보(2) 중 하나를 숫자로 입력하세요.")
                user = readLine()!!.toInt()

                if(user in 0..2){
                    break
                } else{
                    println("잘못 입력했습니다. 다시 입력하세요.")
                }
            }
            computer = (Math.random() * 3).toInt()

            if(user == computer){   // 둘이 동점
                tie++
            } else if(user == 0){   // user 주먹
                if(computer == 1){      // computer 가위
                    win++
                } else lose++           // computer 보
            } else if(user == 1){   // user 가위
                if(computer == 2){      // computer 보
                    win++
                } else lose++           // computer 바위
            } else{                 // user 보
                if(computer == 0){      // computer 주먹
                    win++
                } else lose++           // computer 가위
            }
            println("나 : $user VS 컴퓨터 : $computer  ->  총 $i 판 : ${tie}무, ${win}승, ${lose}패\n")
        }

        while (true){
            println("게임을 다시 시작하겠습니까? Yes(1) / No(2)")
            reply = readLine()!!.toInt()

            if(reply in 1 .. 2){
                break
            } else println("잘못 입력했습니다")
        }
        
        if(reply == 2){
            println("게임을 종료합니다")
            break
        }
    }
}
/*      가위바위보 공식( 0 가위 / 1 바위 / 2 보 )
   com   user              result
   2  -  0 + 2 = 4         1
   0  -  1 + 2 = 1  %  3 = 1 ---> win
   1  -  2 + 2 = 1         1
   -------------------------
   0  -  2 + 2 = 0         0
   1  -  0 + 2 = 3  %  3 = 0 ---> lose
   2  -  1 + 2 = 3         0
   -------------------------
   0  -  0 + 2 = 2         2
   1  -  1 + 2 = 2  %  3 = 2 ---> tie
   2  -  2 + 2 = 2         2
*/
