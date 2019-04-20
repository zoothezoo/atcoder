fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    var a = input[0].toInt()
    var b = input[1].toInt()
    var c = input[2].toInt()

    if(a <= c && c <= b){
        println("Yes")
    }
    else if(b <= c && c <= a){
        println("Yes")
    }
    else{
        println("No")
    }
}