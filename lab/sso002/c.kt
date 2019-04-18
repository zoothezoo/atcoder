fun main(args: Array<String>){
    var num = 0
    repeat(12){
        val read = readLine()!!
        for(i in 0..read.length-1){
            if(read[i] == 'r'){
                num++
                break
            }
        }
    }
    println(num)
}