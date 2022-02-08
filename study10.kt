fun main(args: Array<String>) {
    val l = Lazy()                         // 1번째
    l.flow()                               // 3번째
}
// lazy(느긋한 계산법) - 사용할 때까지 계산을 늦춤
class Lazy{
    init { // lazy는 선언할 때 초기화해서 초기화 과정 X
        println("init")                    // 2번째
    }
    val subject by lazy{ // by lazy : 호출하기 전까지 변수 초기화 X
        println("lazy initialized")        // 6번째
        "subject value"                    // 7번째
    }
    fun flow(){
        println("subject not initialized") // 4번째
        println("subject : $subject")      // 5번째, 처음 호출하는 시점에 by lazy{} 안에 있는 값으로 초기화됨
    }
}
