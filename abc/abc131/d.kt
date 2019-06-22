import kotlin.comparisons.*

data class job(var cost: Int, var dead: Int)

fun main(args: Array<String>){
    val n = readLine()!!.toInt()

    var jobs = mutableListOf<job>()

    repeat(n){
        val (a,b) = readLine()!!.split(" ").map(String::toInt)
        jobs.add(job(a,b))
    }

    val sortedList = jobs.sortedWith(compareBy(job::dead,job::cost))

    val co = mutableListOf<Int>()
    val de = mutableListOf<Int>()

    for(i in 0..n-1){
        val (x,y) = sortedList[i]
        co.add(x)
        de.add(y)
    }

    var sumtime = 0

    for(i in 0..n-1){
        sumtime += co[i]
        if(de[i] < sumtime){
            println("No")
            return
        }
    }
    println("Yes")
}
