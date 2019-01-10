fun main(args: Array<String>){
    val S = readLine()!!
    var min = 1000

    for(i in 0..S.length-3){
        var num = S.substring(i..i+2).toInt()
        if(Math.abs(753-num) <= min){
            min = Math.abs(753-num)
        }
    }
    println(min)
}
