fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    var a = input[0].toInt()
    var b = input[1].toInt()

    var A = (a+1) * b
    var B = a * (b+1)

    if(A > B){
        println(A)
    }
    else{
        println(B)
    }
}