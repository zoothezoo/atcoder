fun main(args: Array<String>){
    val (a,b) = readLine()!!.split(" ").map(String::toInt)


    val ans = if(a < b) 0 else 10

    println(ans)

}