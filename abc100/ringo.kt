fun main(args :Array<String>){
    val input = readLine()!!.split(" ")
    var d = input[0].toInt()
    val n = input[1].toInt()
    var ans = n
    /*for(i in 1..d){
        println(i)
        ans= n*100
    }*/
    while(d>0){
        ans = ans*100
        d = d - 1
    }
    println(ans)
}
