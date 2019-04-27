fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    val A = readLine()!!.split(" ")

    var a = mutableListOf<Int>()

    for(i in 0..n-1){
        a.add(A[i].toInt())
    }

    a.sort()

    if(n == 2){
        println(a[1])
        return
    }

    var anslist = mutableListOf<Int>()
    anslist.add(a[a.lastIndex-1])

    for(i in n-1 downTo 0){
        if(a[i] % anslist[anslist.lastIndex] == 0){
            continue
        }
        else{
            ans1 = find(a[i], ans1)
            anslist.add(ans1)
        }
    }


    anslist.sort()

    var cnt = 0
    for(i in 0..n-1){
        if(a[i] % anslist[0] != 0){
            cnt++
            if(cnt == 1){
                println(anslist[0])
                return
            }
        }
    }
    
    if(cnt == 1){
        return
    }

    if(cnt == 0){
        println(anslist[anslist.size-1])
    }
}

fun find(a: Int, b: Int): Int{
    var x = a
    var y = b
    var tmp = x % y
    while(tmp != 0){
        x = y
        y = tmp
        tmp = x % y
    }
    return y
}

