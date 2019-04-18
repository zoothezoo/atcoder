fun main(args: Array<String>){
    val N :Int = readLine()!!.toInt()
    val x :List<Int> = readLine()!!.split(" ").map(String::toInt)
    var y :List<Int> = x.drop(0).sorted()
    var ans :Int
    val s :Int =y[N/2]
    val t :Int =y[(N/2)-1]
    //y.sort()
    //println(x)
    //println(y)
    for(i in x.indices){
        ans=if(x[i] < s) s else t 
        println(ans)
    }
}
