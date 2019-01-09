fun main(args: Array<String>){
    val N = readLine()!!.toInt()
    val price :MutableList<Int> = mutableListOf<Int>()

    for(i in 0 .. N-1){
        price.add(readLine()!!.toInt())
    }

    var ex = 0
    var index = 0
    var sum = 0

    for(i in 0 .. N-1){
        if(price[i] >= ex){
            ex = price[i]
            index = i
        }
        sum += price[i]
    }

    sum = sum - ex

    sum = sum + ex/2

    println(sum)


}
