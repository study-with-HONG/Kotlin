fun main(args: Array<String>) { // collection
    //// List - 요소 추가, 삭제 불가능
//    var num:List<Int> = listOf(1, 2, 3, 4, 5)
//    for (i in num) println("$i")

//    var str:List<String> = listOf("one", "two", "three", "four", "five")
//    println(str.size)               // list 총 길이
//    println(str.get(0))             // index[0]에 있는 것 -> one
//    println(str.indexOf("two"))     // "two"의 index
//    println(str.contains("three") ) // "three" 존재여부
//    println(str.indices)            // str의 index 범위 -> 0..2

    //// index 찾기
//    var findIdx = -1
//    for(i in 0..str.size-1){
//        if(str.get(i) === "four"){
//            findIdx = i
//            break
//        }
//    }
//    println("${str[findIdx]}의 index : $findIdx")

    //// 자료형 mix
//    var mixList = listOf("hi", 1, true, 1.1)
//    for(k in mixList) println("$k")

    //// emptyList - 빈 list 생성
//    val emptyList = emptyList<String>()
//    println(emptyList)

    //// listOfNotNull - null이 아닌 요소(element)만 고르기
//    val notNullList:List<Int> = listOfNotNull(1, null, 3, null, 5, 6)
//    println(notNullList)

    //// ArrayList - 요소 추가, 삭제 가능
//    val arrList:ArrayList<String> = arrayListOf("a", "b", "c")
//    arrList.add("d")
//    println(arrList)

    //// MutableList - 요소 추가, 삭제 가능
//    val mutableList:MutableList<String> = mutableListOf<String>("kim", "lee", "park")
//    mutableList.add("hong")      // 추가
//    println(mutableList)
//    mutableList.removeAt(0) // 삭제
//    println(mutableList)
//    mutableList[1] = "hwang"     // 수정
//    println(mutableList)

//    val mixMutable = mutableListOf("abc", 123, true, "12.12")
//    println(mixMutable) // 자료형이 달라도 오류X

    //// object 관리
//    val pet:MutableList<Pet> = mutableListOf()
//    var p = Pet("뽀삐", "dog")
//    pet.add(p)
//    pet.add(Pet("삼색", "cat")) // p에 안 넣고 한 줄로 작성 가능
//    pet.add(Pet("아우우", "wolf"))
//
//    for(k in pet){
//        println("${k.name} ${k.speices}")
//    }

    //// toMutableList : List -> MutableList
//    val fromLst:List<Int> = listOf(1, 2, 3)
//    val toMutable = fromLst.toMutableList()
//    toMutable.add(4)
//    println(toMutable)

    //// toList, listOf : Array -> List
//    val fromArr = arrayOf(1, 2, 3)
//    val toLst1 = fromArr.toList()
//    val toLst2 = listOf(*fromArr) // listOf를 사용할 때는 array 변수명 앞에 *
//    println("$toLst1  $toLst2")

    //// toTypedArray : List -> Array
//    val toArr = toLst1.toTypedArray()
//    println(toArr.contentToString())
}
class Pet(val name:String, val speices:String)
