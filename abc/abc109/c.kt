fun main(args: Array<String>){
    val (n,x) = readLine()!!.split(" ").map(String::toInt)
    val list = readLine()!!.split(" ").map(String::toInt)

    val difflist = mutableListOf<Int>()

    for(i in 0..list.size-1){
            difflist.add(Math.abs(x-list[i]))
    }

    var answer = difflist[0]
    for(i in 0..difflist.size-2){
        answer = gcd(answer,difflist[i+1])
    }

    //println(difflist)
    println(answer)


}


fun gcd(a: Int, b: Int): Int = if(a < b) gcd(b, a) else if(b == 0) a else gcd(b, a % b)
fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)