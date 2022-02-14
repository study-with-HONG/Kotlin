fun main(args: Array<String>) {
    /*  Random number 찾기
        범위 : 1 ~ 100
        정답 : 50
        입력 : 40 -> 정답보다 작습니다
              80 -> 정답보다 큽니다
              50 -> 정답입니다
        기회 : 10번 -> 끝나면 결과 알려주고 재시작 여부 확인
    */
    var answer:Int // 랜덤 숫자
    var user:Int
    var reply:Int

    while (true){
        println("게임을 시작합니다.")
        answer = (Math.random() * 100).toInt() + 1
//        println(answer)

        for(i in 1 .. 10){ // 10번의 기회
            println("1부터 100까지 숫자를 입력하세요.")
            user = readLine()!!.toInt()

            if(user > answer){
                println("정답보다 큽니다. ${10-i}번의 기회가 남았습니다")
            } else if(user < answer){
                println("정답보다 작습니다. ${10-i}번의 기회가 남았습니다")
            } else{
                println("정답입니다. ${i}번만에 성공했습니다.")
                break
            }
            if(i == 10) println("게임에 실패했습니다. 정답은 ${answer}입니다")
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
