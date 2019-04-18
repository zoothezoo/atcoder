fun main(args: Array<String>){
    val N :Int = readLine()!!.toInt()
    val (D , X) = readLine()!!.split(" ").map(String::toInt)
    val A = mutableListOf<Int>()
    var sum :Int = 0
    for(i in 1..N){
        A.add(readLine()!!.toInt())
    }
    for(i in A.indices){
        sum = sum + ((D+A[i]-1)/A[i])
    }
    println(sum + X)
}
