fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    val a :Int = input[0].toInt()
    val b :Int = input[1].toInt()
    val ab :Int = input[2].toInt()
    val x :Int = input[3].toInt()
    val y :Int = input[4].toInt()
    var sum :Int
    if(a+b <= 2*ab){
        sum = a*x + b*y
    }
    else{
        val few = if(x >= y) 2*ab*y + a*(x-y) else 2*ab*x + b*(y-x)
        val someabs = if(x >= y) 2*ab*x else 2*ab*y
        sum = if(few >= someabs) someabs else few
    }
    println(sum)
}
