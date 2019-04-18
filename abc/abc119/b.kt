fun main(args: Array<String>){
    val n = readLine()!!.toInt()

    var ans = 0.0

    repeat(n){
        val input = readLine()!!.split(" ")

        if(input[1] == "JPY"){
            ans += input[0].toDouble() 
        }
        else{
            ans += input[0].toDouble() * 380000
        }
    }

    println(ans)

}