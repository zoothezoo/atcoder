fun main(args: Array<String>){
    val (n,x) = readLine()!!.split(" ").map(String::toInt)
    val list = readLine()!!.split(" ").map(String::toInt)

    var sum = 0
    var count = 0

    if(list[0] > x){
        println(1)
        return
    }

    for(i in 0..list.size-1){
        if(sum <= x){
            sum += list[i]
            count++
        }
        else{
            break
        }
    }

    if(sum <= x){
        count++
    }

    println(count)

}
