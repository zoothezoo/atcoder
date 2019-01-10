fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    val X = input[0].toInt()
    val Y = input[1].toInt()

    if(X > Y){
        println(X)
    }
    else{
        println(Y)
    }
}
