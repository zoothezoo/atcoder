fun main(args: Array<String>){
    var (N, A, B, S, T)= readLine()!!.split(" ").map(String::toInt)
    val alist = mutableListOf<Int>()
    val blist = mutableListOf<Int>()

    repeat(N){
        val input = readLine()!!.split(" ")
        alist.add(input[0].toInt())
        blist.add(input[1].toInt())
    }



    for(i in 0..N-1){
        A = A + alist[i]
        B = B + blist[i]
        A = A - S
        B = B - T
        if(A <= 0 || B <= 0){
            println("NO")
            return
        }
    }


    println("YES")

}

