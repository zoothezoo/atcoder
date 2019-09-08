fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    var list = readLine()!!.split(" ").map(String::toInt).toMutableList()

    list.sort()

    val half = list.size/2

    if(list[half-1] == list[half]){
        println(0)
    }
    else{
        println(list[half] - list[half-1])
    }
}


fun gcd(a: Int, b: Int): Int = if(a < b) gcd(b, a) else if(b == 0) a else gcd(b, a % b)
fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)
