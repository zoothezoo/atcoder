fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    var s = readLine()!!
    var cntp = 0
    var cnts = 0
    var flag = 0
    var fla = 0
    var fl = 0
    if(s[0] == '#'){
        for(i in 0..n-1){
            if(s[i] == '.'){
                cntp++
            }
            else{
                cnts++
            }
        }
        if(cntp < cnts){
            println(cntp)
        }
        else{
            println(cnts)
        }
    }

    else{
        for(i in 0..n-1){
            if(s[i] == '#'){
                flag = i
                break
            }
        }
        var firstp = flag

        for(i in n-1 downTo 0){
            if(s[i] == '.'){
                fl = i
                break
            }
        }
        var lasts = n - fl - 1

        for(i in n-1 downTo 0){
            if(s[i] == '#'){
                fla = i
                break
            }
        }
        var lastf = n - fla - 1


        if(s[n-1] == '#'){
        for(i in flag..n-1){
            if(s[i] == '.'){
                cntp++
            }
            else{
                cnts++
            }
        }
        if(cnts - lasts <= cntp){
            println(cnts-lasts)
        }
        else{
            println(cntp)
        }
        }
        else{
            for(i in 0..n-1){
                if()

            }
        }
        

    }
}

