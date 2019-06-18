fun main(args: Array<String>){

    val (w,h,x,y) = readLine()!!.split(" ").map(String::toDouble)

    var way = 0

    if(x == w/2 && y == h/2){
        way = 1
    }

    val a1: Double = h / w
    val a2: Double = -h / w

    //if(w == a1*x || w == a2*x + h){
    //    way = 0
    //}

    //println("$a1,$a2")

    val ans:Double = w * h / 2

    println("$ans $way")
}
