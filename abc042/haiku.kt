fun main(args: Array<String>){
    val haiku : String? = readLine()
    var count5 : Int = 0
    var count7 : Int = 0
    if(haiku != null){
        var hai = haiku.split(" ")
        for(i in hai.indices){
            if(hai[i]=="5"){
                count5 = count5 + 1
            }
            else if(hai[i]=="7"){
                count7 = count7 + 1
            }
        }
        val str = if(count5 == 2 && count7 == 1) "YES" else "NO"
        println(str)
    }
}
