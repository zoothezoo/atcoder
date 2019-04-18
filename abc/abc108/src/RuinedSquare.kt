fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    val x1 = input[0].toInt()
    val y1 = input[1].toInt()
    val x2 = input[2].toInt()
    val y2 = input[3].toInt()

    println("${x2-(y2-y1)} ${y2+(x2-x1)} ${x1-(y2-y1)} ${y1+(x2-x1)}")
}