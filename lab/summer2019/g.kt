fun main(args: Array<String>){
    val (N,K) = readLine()!!.split(" ").map(String::toInt)
    val input = mutableListOf<String>()
    repeat(N){
        input.add(readLine()!!)
    }

    var oko = 0

    for(i in 0..input.size-1){
        var countA = 0
        var countB = 0
        println(input[i])
        for(j in 0..input[i].length-1){
            if(j % 2 == 0){
                if(input[i][j] != 'k'){
                    countA++
                }
                if(input[i][j] != 'o'){
                    countB++
                }
            }
            else{
                if(input[i][j] != 'o'){
                    countA++
                }
                if(input[i][j] != 'k'){
                    countB++
                }
            }
        }

        println(countA)
        println(countB)
        println("------")

        var count = 0
        if(countA > countB){
            count = countB
        }
        else{
            count = countA
        }


        if(count > K) {
            oko++
        }
    }
    println(oko)
}
