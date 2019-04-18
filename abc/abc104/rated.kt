fun main(args: Array<String>){
    val R = readLine()!!.toInt()
    var str = "A"
    if(R < 1200){
        str = "ABC"
    }
    else if(R < 2400){
        str = "ARC"
    }
    else{
        str = "AGC"
    }
    println(str)
}

