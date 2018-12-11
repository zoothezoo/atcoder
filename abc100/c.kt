fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    var input = readLine()!!.split(" ")
    var co = 0
    var a : Array<Int>
    for(i in input){
       a[i] = input[i].toInt()
        if(a[i] % 2 == 0){
            co++
            a[i] = a[i] / 2
        }
    }
    println(co)
}

