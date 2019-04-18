fun main(args: Array<String>){
    val N = readLine()!!.toInt()
    var sum = 0
    for(i in 1..N){
        sum = sum + i
    }
    println(sum * 10000 / N )
}
