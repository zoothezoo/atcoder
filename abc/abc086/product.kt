fun main(args : Array<String>){
    val input = readLine()!!.split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()
    val ans = if(a % 2 == 1 && b % 2 == 1) "Odd" else "Even"
    println(ans)
}
