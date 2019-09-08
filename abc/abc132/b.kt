fun main(args: Array<String>){

    val n = readLine()!!.toInt()
    val list = readLine()!!.split(" ").map(String::toInt)
    var count = 0

    for(i in 1..n-2){
        if(list[i-1]<list[i] && list[i]<list[i+1]){
            count++
        }
        else if(list[i+1]<list[i] && list[i]<list[i-1]){
            count++
        }
    }

    println(count)


}


fun gcd(a: Int, b: Int): Int = if(a < b) gcd(b, a) else if(b == 0) a else gcd(b, a % b)
fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)
