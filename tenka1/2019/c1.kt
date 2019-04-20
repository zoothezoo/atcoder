fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    var s = readLine()!!
    var min = 99999
    var sum = 0
    var cnt = 0

    for(i in 0..n-1){
        if(s[i] == '.'){
            cnt++
        }
    }

    min = cnt

    for(i in 1..n){
        var cnts = 0
        var cntp = 0
        for(j in 0..i-1){
            if(s[j] == '#'){
                cnts++
            }
        }
        for(j in n-1 downTo i){
            if(s[j] == '.'){
                cntp++
            }
        }
        sum = cntp + cnts
        
        if(min > sum){
            min = sum
        }
    }
    println(min)
}