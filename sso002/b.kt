fun main(args: Array<String>){
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var n = readLine()!!.toInt()

    while(true){
        if(n % a == 0 && n % b == 0){
            println(n)
            return
        }
        n++
    }
}