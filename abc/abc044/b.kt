fun main(args: Array<String>){
    val str = readLine()!!
    for(i in str.indices){
        var cnt = 0
        for(j in str.indices){
            if(str[i] == str[j]){
                cnt++
            }
        }
        if(cnt % 2 != 0){
            println("No")
            return
        }
    }
    println("Yes")
}