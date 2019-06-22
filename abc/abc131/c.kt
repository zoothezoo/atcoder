val zero: Long = 0
fun main(args: Array<String>){
    val (a,b,c,d) = readLine()!!.split(" ").map(String::toLong)
    var s: Long = 0
    var t: Long = 0
    var st: Long = 0
    var e = lcm(c,d)



    val a1 = b / c
    val a2 = (a-1) / c
    val b1 = b / d
    val b2 = (a-1) / d
    val e1 = b / e
    val e2 = (a-1) / e


    val aa = a1 - a2
    val bb = b1 - b2
    val ee = e1 - e2


    val range = b - a + 1

    println(range - aa - bb + ee)




}
fun gcd(a: Long, b: Long): Long= if(a < b) gcd(b, a) else if(b == zero) a else gcd(b, a % b)
fun lcm(a: Long, b: Long): Long= (a * b) / gcd(a, b)

