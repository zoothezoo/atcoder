fun main(args: Array<String>){
    val (N,M) = readLine()!!.split(" ").map(String::toInt)
    var yen = 0

    when(N){
        200 -> yen = 650
        320, 370, 420 -> yen = 700
        else -> yen = 800
    }

    val set = M / 5

    yen += 100*set

    println(yen)
}
