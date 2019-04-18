fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    val input = readLine()!!.split(" ")
    val list :MutableList<Int> = mutableListOf<Int>()
    for(i in 0..n-1){
        list.add(input[i].toInt())
    }

    list.sort()

    var sum = 0

    for(i in 0..n-2){
        sum = sum + list[i]
    }

    if(sum <= list[n-1]){
        println("No")
    }
    else{
        println("Yes")
    }
}
