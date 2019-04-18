fun main(args: Array<String>){
    val a = readLine()!!.split(" ")
    val N :Int = a[0].toInt()
    var X :Int = a[1].toInt()
    val m :IntArray = IntArray(N)
    var count = N - 1
    for(i in m.indices){
        m[i] = readLine()!!.toInt()
    }
    //println(m.joinToString())
    m.sort()
    //println(m.joinToString())
    for(i in 1..N-1){
        X = X - m[i]
    }
    while(X >= m[0]){
        X = X - m[0]
        count = count + 1
    }
    println(count)
}
