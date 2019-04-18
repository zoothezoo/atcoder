fun main(args: Array<String>){
    val a =readLine()!!.split(" ")
    val cat :Int = a[0].toInt()
    val ani :Int = a[1].toInt()
    val sumcat :Int =a[2].toInt()
    val ans = if(cat + ani >= sumcat && cat <= sumcat) "YES" else "NO"
    println(ans)
}
