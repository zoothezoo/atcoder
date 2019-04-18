fun main(args: Array<String>){
    val a =readLine()!!.toInt()
    val b = readLine()!!.split(" ")
    //val x :IntArray = IntArray(a)
    //val odd :IntArray = IntArray(a-1)
    val x =mutableListOf<Int>()
    val cop =mutableListOf<Int>()
    for(i in 0..a-1){
        x.add(b[i].toInt())
        println(x)
    }
    cop.sort()
    for(i in x.indices){
        val swap = x[i]
        x.remove(x[i])
        println(x)
        println(x[(a-1)/2])
        x.add(swap)
        println(x)

    }

    /*ARRAY version
    for(i in x.indices){
        x[i] = b[i].toInt()
    }
    //println(x.joinToString())
    for(i in x.indices){
        for(j in 0..i-1){
            odd[j]=x[j]
        }
        for(j in i..a-2){
            odd[j]=x[j+1]
        }
        //println(odd.joinToString())
     */

    /*LIST*/
    println(median)
}


