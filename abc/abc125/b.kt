fun main(args: Array<String>){

    val n = readLine()!!.toInt()
    val v = readLine()!!.split(" ")
    val c = readLine()!!.split(" ")
    
    val diff = mutableListOf<Int>()

    var ans = 0

    for(i in 0.. n-1){
        diff.add(v[i].toInt()-c[i].toInt)

        if(diff[i] > 0){
            ans += diff[i]
        }
    }
    println(ans)




}