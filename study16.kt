fun main(args: Array<String>) {
    //// Map - <key, value>
//    val map:Map<Int, String> = mapOf(1 to "one", 2 to "two", 3 to "three")
//    for((key, value ) in map){
//        println("key : $key, value : $value")
//    }
//    println(map[1]) // index가 아니라 key값
//    println(map.get(2))
//    println(map)
//    println("${map.keys} ${map.values}")

    //// MutableMap - 가변형 map, 추가랑 삭제 가능
//     val mutMap:MutableMap<Int, String> = mutableMapOf(4 to "four", 5 to "five", 6 to "six")
//    println(mutMap)
//    println("${mutMap.keys} ${mutMap.values}")
//    mutMap.put(7, "seven")  // 추가
//    mutMap.remove(4)    // 삭제
//    println(mutMap)

//     val putData = mutableMapOf(8 to "eight", 9 to "nine", 10 to "ten")
//     mutMap.putAll(putData)  // 여러 개 추가 가능
//     println(mutMap)

    //// 정렬
//     var sortDesc = mutMap.toList().sortedByDescending { it.first } // 내림차순
//     println(sortDesc)
//     var sortAsc = sortDesc.toList().sortedBy { it.first }          // 오름차순
//     println(sortAsc)
}
