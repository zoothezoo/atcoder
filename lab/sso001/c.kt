fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    val l = input[0].toInt()
    val h = input[1].toInt()
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()

    for(i in 0..n-1){
        list.add(readLine()!!.toInt())
    }

    for(i in 0..n-1){
        if(list[i] < l){
            println(l - list[i])
        }
        else if(list[i] > h){
            println("-1")
        }
        else{
            println("0")
        }
    }
}