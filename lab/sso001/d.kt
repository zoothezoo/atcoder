fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    val h = input[0].toDouble()
    val m = input[1].toInt()

    var hour = 360 / 12 * h

    if(h > 12){
        hour = 360 / 12 * (h - 12)
    }

    hour = hour + (0.5 * m)
    var min = 360 / 60 * m

    val ans1 = Math.abs(hour - min)
    val ans2 = Math.abs(ans1 - 360)

    if(ans1 > ans2){
       println(ans2) 
    }
    else{
        println(ans1)
    }
}