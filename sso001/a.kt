fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    val a = input[0].toInt()
    val b = input[1].toInt()

    if(a > b){
        println("Worse")
    }
    else{
        println("Better")
    }
}