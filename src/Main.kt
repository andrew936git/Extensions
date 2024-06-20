import kotlin.math.sqrt
fun main() {
//1
    val num = 10
    println(num.secondDegree())
    println("==========================================")
//2
    val text1 = "World!"
    val text2 = "Hello"
    println(text2.concatenation(text1))
    println("==========================================")
//3
    val line = "параллелепипед"
    println("Последний индекс - ${line.lastIndex()}")
    println("==========================================")
//4
    val number = 24
    println(number.sqrtInt())
}

fun Int.secondDegree(): Int{
    val res = this * this
    return res
}

fun String.concatenation(text: String): String{
    val concatString = "$this $text"
    return concatString
}

fun String.lastIndex(): Int {
    val num = this.length - 1
    return num
}

fun Int.sqrtInt(): Int{
    val res: Double = sqrt(this.toDouble())
    return res.toInt()
}
