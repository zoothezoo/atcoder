fun main(args: Array<String>){
    val ramen :Int = 700
    var count :Int = 0
    val menu :String? = readLine()
    var sum :Int
    if(menu != null){
        //println(menu)
        for(i in menu.indices){
            //println(menu[i])
            //count = if(menu[i] == 'o') count.inc() else count.plusAssign()
            if(menu[i] == 'o'){
                count++
            }
            //println(count)
        }
        sum = ramen + 100*count
        println(sum)
    }
}

