import java.io.*
import java.util.*

fun main(args: Array<String>) {
//     val path = "C:\\myfile\\myfile.txt" // 파일 경로

    //// listFiles 폴더에 있는 파일목록 불러오기
//    val f = File("C:\\").listFiles()
//    println(Arrays.toString(f))

    //// file 생성 및 쓰기
//    val str:String = "안녕하세요\n반갑습니다"

    // printWriter
//    File(path).printWriter().use { it.println(str) }
    // bufferedWriter
//    File(path).bufferedWriter().use { it.write(str) }
    // FileWriter
//    val w = FileWriter(path)
//    try{
//        w.write(str)
//    } catch (e:Exception){}
//    finally {
//        w.close()
//    }

    //// copyTo 파일 복사
//    File(path).copyTo(File("C:\\myfile\\myfile2.txt"))

    //// file 읽기
    // forEachLine 읽기만 가능
//    File(path).forEachLine { println(it) }
    // readText 데이터를 변수에 담아 사용할 수 있음
//    val text = File(path).readText()
//    println(text)
    // 한 줄씩 읽기
//    val ff = File(path)
//    val inputStream:InputStream = ff.inputStream()
//    val inputStreamReader = InputStreamReader(inputStream)
//    val br = BufferedReader(inputStreamReader)
//    val sb = StringBuffer()
//
//    var line:String?
//
//    try {
//        line = br.readLine()
//        while (line != null){
//            sb.append(line, "\n")
//            line = br.readLine()
//        }
//        println(sb)
//    }catch (e:Exception){
//        e.printStackTrace()
//    }finally {
//        br.close()
//    }

    //// use함수 - close 자동으로 처리
//    val fff = File(path)
//    val iStream:InputStream = fff.inputStream()
//    val readFile = iStream.bufferedReader().use { it.readText() }
//    println(readFile)

    //// useLines 한 줄씩 읽기
//    val bufferRead = File(path).bufferedReader()
//    val line = mutableListOf<String>()
//    bufferRead.useLines { l -> l.forEach { line.add(it) } }
//    line.forEach{ println(it) }
}
