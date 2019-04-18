fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    //val a = input[0].toInt()
    //val b = input[1].toInt()
    //val c = input[2].toInt()
    //val d = input[3].toInt()
    //val e = input[4].toInt()
    val list = mutableListOf<Int>()

    for(i in 0..2){
        for(j in i+1..3){
            for(k in j+1..4){
                list.add(input[i].toInt() + input[j].toInt() + input[k].toInt())
            }
        }
    }

    list.sort()

    val ind = list.size


    println(list[ind-3])
}