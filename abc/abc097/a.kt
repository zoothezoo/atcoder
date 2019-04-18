import kotlin.math.*
fun main(args: Array<String>){
    val par = readLine()!!.split(" ")
    val a = par[0].toInt()
    val b = par[1].toInt()
    val c = par[2].toInt()
    val d = par[3].toInt()

    if(abs(a-b) <= d){
        println("Yes")
    }
    else if(abs(a-b) <= 2*b && abs(a-c) <= d){
            println("Yes")
    }
    else{
        println("No")
    }
}
