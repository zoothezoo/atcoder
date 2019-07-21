import java.lang.Math

fun main(args: Array<String>){
    val s = readLine()!!.toLong()
    var route = java.lang.Math.sqrt(s.toDouble())
    var top = java.lang.Math.ceil(route).toLong()
    //var route = kotlin.math.sqrt(s.toDouble())
    //var top = kotlin.math.ceil(route).toLong()

    val square: Long = top*top

            //println("square:$square, top:$top ")
    val jp9 = 1000000000 //10^9

    var n: Long = square - s
    var ax: Long = 0
    var ay: Long = 0
    val zero: Long = 0

    for(i in 1..1000000000){
        val ilong: Long = i.toLong()
        if(n % ilong == zero){
            ax = ilong
            ay = n / ax
            //println("ax:$ax, ay:$ay")
            if(ax <= jp9 && ay <= jp9){
               // println("ok")
                break
            }
        }
    }

    //println("x1:$ax,y1:$top,x2:$top y2:$ay")
    println("0 0 $ax $top $top $ay")


}

fun gcd(a: Int, b: Int): Int = if(a < b) gcd(b, a) else if(b == 0) a else gcd(b, a % b)
fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)