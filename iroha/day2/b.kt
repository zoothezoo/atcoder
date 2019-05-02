fun main(args: Array<String>){
    val in0 = readLine()!!.split(" ")
    val in1 = readLine()!!.split(" ")
    val in2 = readLine()!!.split(" ")
    val in3 = readLine()!!.split(" ")

    val X = in0[0].toDouble()
    val Y = in0[1].toDouble()
    val A = in1[0].toDouble()
    val B = in1[1].toDouble()
    val Sx = in2[0].toDouble()
    val Sy = in2[1].toDouble()
    val Tx = in3[0].toDouble()
    val Ty = in3[1].toDouble()
    


    var rivera = (B - A) / X
    var riverb = A

    if(Tx == Sx){
        var y = rivera * Tx + riverb
        if(Sy <= y && y <= Ty){
            println("Yes")
        }
        else{
            println("No")
        }
        return
    }

    var ma = (Sy - Ty) / (Sx - Tx)
    var mb = Ty - (ma * Tx)

    if(rivera == ma){
        println("No")
        return
    }
    
    var x = (mb - riverb) / (rivera - ma)
    
    var l = Tx
    var r = Sx

    //println("ma: $ma, mb: $mb")
    //println("rivera: $rivera, nb: $riverb")
    //println("x: $x")

    if(Tx - Sx < 0){
        r = Tx
        l = Sx
    }



    if(r <= x && x <= l){
        println("Yes")
    }
    else{
        println("No")
    }
}