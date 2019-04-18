fun main(args: Array<String>){
    val N = readLine()!!.toInt()
    val mochi = mutableListOf<Int>()
    val flag = mutableListOf<Boolean>()
    var count = 0
    repeat(N){
        mochi.add(readLine()!!.toInt())
        flag.add(false)
    }
    //println(mochi)

    for(i in 0..N-1){
        if(flag[i] == false){
            for(j in i+1..N-1){
                if(mochi[i] == mochi[j]){
                    count++
                    flag[i] = true
                    flag[j] = true
                }
            }
        }
        //println(flag)
    }
    val ans = N - count
    println(ans)
}
