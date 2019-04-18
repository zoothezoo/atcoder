fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    val N = input[0].toInt()
    val Q = input[1].toInt()

    var list = mutableListOf<Int>()

    list.add(9)

    repeat(N){
        list.add(0)
    }

    for(i in 0..Q-1){
        val inp = readLine()!!.split(" ")
        val s = inp[0].toInt()
        val t = inp[1].toInt()

        for(j in s..t){
            list[j] += 1
        }
    }
    
    for(i in 1..N){
        if(list[i] % 2 == 0){
            print("0")
        }
        else{
            print("1")
        }
    }
    println()
}