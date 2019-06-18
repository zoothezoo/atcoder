var count = 0

fun main(args: Array<String>){
    val (n,k) = readLine()!!.split(" ").map(String::toInt)
    val list = readLine()!!.split(" ").map(String::toInt).toMutableList()

    if(list.sum() < k){
        println(0)
    }
    else{
        count++
    }



    val bool = co(list, k)

    println(count)


}

fun co(list: MutableList<Int>, k: Int): Boolean {
    var rightlist: MutableList<Int> = mutableListOf()
    var leftlist: MutableList<Int> = mutableListOf()

    if(list.size == 0){
        return true
    }

    if(list.sum() < k){
        println("return")
        return true
    }

    if(list.size == 1){
        if(list[0] <= k){
            count++
            println("return")
            return true
        }
        else{
            println("return")
            return true
        }

    }


    var i = 1

    var bool = true
    while(i <= list.size-1){
        rightlist = mutableListOf<Int>()
        leftlist = mutableListOf<Int>()
        for(j in 0..i-1){
            rightlist.add(list[j])
        }
        for(j in i..list.size-1){
            leftlist.add(list[j])
        }
        println("--------")
        println(rightlist)
        println(leftlist)


        if(rightlist.sum() >= k){
            println("right")
            bool = co(rightlist, k)
            count++
            return true
        }
        else if(leftlist.sum() >= k){
            println("left")
            bool = co(leftlist, k)
            count++
            return true
        }
        else{
            i++
        }
    }
    println("no")
    return true

}
