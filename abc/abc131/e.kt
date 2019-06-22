fun main(args: Array<String>){
    val (n,k) = readLine()!!.split(" ").map(String::toInt)
    val max = (n-1)*(n-2)/2

    if(max < k){
        println(-1)
        return
    }

    val redu = if(k < max) max-k else 0
    var count = 0
    println(n-1+redu)

    for(i in 1..n){
        for(j in i+1..n){
            println("$i $j")
            count++
            if(count == n-1+redu){
                return
            }
        }
    }
}