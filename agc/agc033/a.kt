fun main(args: Array<String>){

    val input = readLine()!!.split(" ")
    val H = input[0].toInt()
    val W = input[1].toInt()

    val hlist: MutableList<MutableList<Char>> = mutableListOf()
    val array = mutableListOf<Int>()

    for(i in 0..H-1){
        var wlist: MutableList<Char> = mutableListOf()
        var inp = readLine()!!
        hlist.add(wlist)
        for(j in 0..W-1) {
            wlist.add(inp[j])
            if(hlist[i][j] == '#'){
                array.add(i)
                array.add(j)
            }
        }
    }

    //var t = 0
    //while(t < array.size-1) {
    //    println("${array[t]},${array[t + 1]}")
    //    t = t + 2
    //}

    var max = 0

    val mid = W/2

    for(i in 0..H-1) {
        for(j in 0..mid-1) {
            var mindistance = 100000000
            if(hlist[i][j] == '.'){
                //println(".[$i][$j]")
                var t=0
                while(t < array.size-1){
                    var distance = Math.abs(i - array[t]) + Math.abs(j - array[t+1])
                    //println("t: ${(t+1)/2}, ditance: $distance")
                    if(mindistance > distance) {
                        mindistance = distance
                        //println("mindistance: $mindistance")
                        if(mindistance <= max){
                            break

                        }
                    }
                    t = t+2
                }
                if (max < mindistance){
                    max = mindistance
                }

            }
            //println("------------------------------")
        }
        for(j in W-1 downTo mid) {
            var mindistance = 100000000
            if(hlist[i][j] == '.'){
                //println(".[$i][$j]")
                var t= array.size -1
                while(t > 0){
                //while(t < array.size-1){
                    var distance = Math.abs(i - array[t-1]) + Math.abs(j - array[t])
                    //println("t: ${(t+1)/2}, ditance: $distance")
                    if(mindistance > distance) {
                        mindistance = distance
                        //println("mindistance: $mindistance")
                        if(mindistance <= max){
                            break

                        }
                    }
                    t = t-2
                }
                if (max < mindistance){
                    max = mindistance
                }

            }
            //println("------------------------------")
        }
    }

    //for(i in 0..H-1) {
    //    for(j in 0..W-1) {
    //        print(hlist[i][j])
    //    }
    //    println()
    //}

    println(max)
}