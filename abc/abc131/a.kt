fun main(args: Array<String>){
    val list = readLine()!!

    for(i in 0..list.length-2){
        if(list[i] == list[i+1]){
            println("Bad")
            return
        }
    }
    println("Good")
}