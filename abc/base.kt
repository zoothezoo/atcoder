fun main(args: Array<String>){

}


fun gcd(a: Int, b: Int): Int = if(a < b) gcd(b, a) else if(b == 0) a else gcd(b, a % b)
fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)