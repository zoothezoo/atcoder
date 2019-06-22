fun main(args: Array<String>){
    val (n,l) = readLine()!!.split(" ").map(String::toInt)

    val apple = mutableListOf<Int>()

    var zeroflag = false
    var flag = false
    var nflag = false


    for(i in l..l+n-1){
        if(i == 0){
            zeroflag = true
        }
        else if(i == 1){
            flag = true
        }
        else if(i == -1){
            nflag = true
        }
        apple.add(i)
    }

    if(zeroflag){
        println(apple.sum())
    }
    else if(apple.sum() > 0){
        if(flag){
            println(apple.sum()-1)
        }
        else{
            println(apple.sum()-apple[0])
        }
    }
    else if(apple.sum() < 0){
        if(nflag){
            println(apple.sum()+1)
        }
        else{
            println(apple.sum()-apple[apple.size-1])
        }
    }
    else{
        println(apple.sum())
    }


}
