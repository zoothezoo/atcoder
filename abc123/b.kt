fun main(args: Array<String>){
    val input :MutableList<Int> = mutableListOf()
    repeat(5){
        input.add(readLine()!!.toInt())
    }
    var max = 0
    var index = 0
    for(i in 0..4){
        if(input[i] % 10 == 0){
        }
        else if(max < 10 - input[i]%10){
            max = 10 - input[i]%10
            index = i
        }
    }
    var time = 0
    for(i in 0..4){
        if(i == index){
        }
        else{
            time += input[i]
            if(input[i] % 10 != 0){
                time += 10 - input[i]%10
            }
        }
    }
    time += input[index]
    println(time)
}
