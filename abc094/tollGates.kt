
fun main(args: Array<String>){
    val a =readLine()!!.split(" ")
    val square :Int = a[0].toInt()
    val trap :Int = a[1].toInt()
    val start :Int = a[2].toInt()
    val b =readLine()!!.split(" ")
    val fee :IntArray = IntArray(trap)
    var feee = MutableList<Int>(trap, { _ -> 0 })
    var countl :Int = 0
    var countr :Int = 0
    for(i in fee.indices){
        fee[i] = b[i].toInt()
    }
    //println(fee.joinToString())
    for(i in 0..trap-1){
        if(fee[i] > 0 && start > fee[i]){
            //  countl.inc()
            countl = countl + 1
        }
        else if(fee[i] > start && square > fee[i]){
            //countr.inc()
            countr = countr + 1
        }
    }
    //println(countr)
    //println(countl)
    val ans :Int = if(countl >= countr) countr else countl
    println(ans)

}

