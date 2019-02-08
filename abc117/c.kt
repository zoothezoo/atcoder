fun main(args: Array<String>){
    val inputa = readLine()!!.split(" ")
    val n = inputa[0].toInt()
    val m = inputa[1].toInt()

    val inputb = readLine()!!.split(" ")
    val list = mutableListOf<Int>()

    for(i in 0..m-1){
        list.add(inputb[i].toInt())
    }

    list.sort()

    val ablist = mutableListOf<Int>()

    for(i in 0..m-2){
        ablist.add(Math.abs(list[i+1]-list[i]))
    }

    ablist.sort()


    var ans = 0

    for(i in 0..m-n-1){
        ans += ablist[i]
    }

    println(ans)
}
