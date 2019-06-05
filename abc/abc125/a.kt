fun main(args: Array<String>){

    val input = readLine()!!.split(" ")
     
     var a = input[0].toInt()
     var b = input[1].toInt()
     var t = input[2].toInt()

     var m = t / a
     var ans = m * b
    
    println(ans)
}
