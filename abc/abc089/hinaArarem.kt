fun main(args :Array<String>){
    val n : Int = readLine()!!.toInt()
    val line : List<String> =readLine()!!.split(" ")
    for(i in line.indices){
        if(line[i] == "Y"){
            println("Four")
            return
        }
    }
    println("Three")
}
