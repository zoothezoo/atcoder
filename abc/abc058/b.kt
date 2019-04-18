fun main(arg: Array<String>){
    val O: String = readLine()!!
    val E: String = readLine()!!

    for(i in 0..E.length-1){
        print("${O[i]}${E[i]}")
    }
    if(O.length != E.length){
        print(O.last())
    }
    println()
}
