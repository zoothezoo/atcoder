fun main(args: Array<String>){
    val (H, W) = readLine()!!.split(" ").map{
        it.toInt()
    }

    var a :MutableList<String> = mutableListOf()
    for (i in 0..H-1){
        a.add(readLine()!!)
    }

    val row :MutableList<Boolean> = mutableListOf()
    val col :MutableList<Boolean> = mutableListOf()
    for (i in 0..H-1){
        row.add(false)
    }
    for (i in 0..W-1){
        col.add(false)
    }

    for (i in 0..H-1) {
        for (j in 0..W-1){
            if (a[i][j] == '#'){
                row[i] = true
                col[j] = true
            }
        }
    }

    for (i in 0..H-1){
        if(row[i]){
            for(j in 0..W-1){
                if(col[j]){
                    print(a[i][j])
                }
            }
            println()
        }
    }
}

