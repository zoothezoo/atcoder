fun main(args: Array<String>){
    val (N,M) = readLine()!!.split(" ").map(String::toInt)
    val alist = readLine()!!.split(" ").map(String::toInt)
    val blist = readLine()!!.split(" ").map(String::toInt)

    val b = blist.sorted()

    a@ for(i in 0..alist.size-1){
        for(j in b.size-1 downTo 0){
            if(alist[i] >= b[j]){
                println(b[j])
                continue@a
            }
        }
        println("0")
    }


}
