fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    val n = input[0].toInt()
    val m = input[1].toInt()

    val list = mutableListOf<Int>()
    for(i in 0..m-1){
        list.add(readLine()!!.toInt())
    }

    for(i in 1..m-1){
        if(list[i] - list[i-1] == 1){
            println("0")
            return
        }
    }

    val step = mutableListOf<Int>()

    step.add(list[0])

    for(i in 1..m-1){
        step.add(list[i] - list[i-1] - 1)
    }

    step.add(n - list[m-1])

    println(step)

    var ans = 1

    for(i in 0..m){
        println(step[i])
        if(step[i] == 1){
        ans = ans * (step[i])
        }
        else{
        ans = ans * (step[i]-1)
        }
    }

    println(ans)
    ans = ans % 1000000007

    println(ans)
}