import java.util.ArrayList

fun main(args: Array<String>){
    val n :Int = readLine()!!.toInt()
    val a :List<String> = readLine()!!.split(" ")
    val input :ArrayList<Int> = ArrayList()
    var large :Int = 0
    var small :Int = 0
    for(i in a.indices){
        input.add(a[i].toInt())
    }
    input.sort()
    for(i in n-1 downTo 0 step 2){
        large += input[i]
        //println(input[i])
    }
    for(i in n-2 downTo 0 step 2){
        small += input[i]
        //println(input[i])
    }
    println(large - small)
}
