fun main(args: Array<String>){
    val input = readLine()!!.split("/")
    val year = input[0].toInt()
    val month = input[1].toInt()
    val day = input[2].toInt()

    if(year <= 2018){
        println("Heisei")
    }
    else if(year == 2019 && month < 5){
        println("Heisei")
    }
    else{
        println("TBD")
    }
}