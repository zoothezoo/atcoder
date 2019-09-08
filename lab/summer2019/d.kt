fun main(args: Array<String>) {
    val n = readLine()!!.toInt()
    val list = mutableListOf<String>()
    repeat(n){
        list.add(readLine()!!)
    }

    var count = 0



    for(i in 0..n-1){
        if(list[i] == "CHENG"){
            count++
        }
    }

    repeat(n){
        list.remove("CHENG")
    }


    repeat(count){
        println(".....")
    }

    for(i in list){
        println(i)
    }


}
