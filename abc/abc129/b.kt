fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    val input = readLine()!!.split(" ")

    val line = mutableListOf<Int>()

    for(i in 0..n-1){
        line.add(input[i].toInt())
    }

    val ans = mutableListOf<Int>()

    for(i in 0..n-1){
        var big = 0
        var small = 0
        for(j in 0..n-1){
            if(i < j){
                big += line[j]
            }
            else{
                small += line[j]
            }
        }
        ans.add(Math.abs(big - small))
    }
    ans.sort()

    //println(ans)
    println(ans[0])
}