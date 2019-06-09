fun main(args: Array<String>){
    val input = readLine()!!.split(" ")

    var list = mutableListOf<Int>()

    for(i in 0..2){
        list.add(input[i].toInt())
    }

    list.sort()

    println(list[1]+list[0])


}