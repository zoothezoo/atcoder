import java.util.*
fun main(args :Array<String>){
    val input = readLine()!!.split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val s :String= if(a < 9 && b < 9) "Yay!" else ":("
    println(s)
}
