fun main(args: Array<String>){
    val input :MutableList<Int> = mutableListOf()
    repeat(5){
        input.add(readLine().toInt())
    }
    val k = readLine().toInt

    for(i in 0..4){
        for(j in 0..4){
            if(Math.abs(input[i] - input[j]) > k){
                println(":(")
                return
            }
        }
    }
    println("Yay!")
}