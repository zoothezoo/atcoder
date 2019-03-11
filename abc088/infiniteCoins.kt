fun main(args :Array<String>){
    val n = readLine()!!.toInt()
    val a = readLine()!!.toInt()
    val ans :String = if(n % 500 <= a) "Yes" else "No"
    println(ans)
}



