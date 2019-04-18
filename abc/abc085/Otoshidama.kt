fun main(args: Array<String>){
    val inp = readLine()!!.split(" ")
    val num = inp[0].toInt()
    val yen = inp[1].toInt()
    var ans = false

    //i:10000
    //j:5000
    //k:1000
    loop@for(i in 0..num){
        if(yen < i*10000){
            continue
        }
        for(j in 0..num-i){
            if(yen < i*10000 + j*5000){
                continue
            }
            for(k in 0..num-i-j){
                if(yen < i*10000 + j*5000 + k*1000){
                    continue
                }
                else if(yen == i*10000 + j*5000 + k*1000){
                    if(i + j + k == num){
                        println("$i $j $k")
                        ans = true
                        break@loop
                    }
                }
            }
        }
    }

    if(ans == false) {
        println("-1 -1 -1")
    }

}
