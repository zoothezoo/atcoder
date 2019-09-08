fun main(args: Array<String>){
    var (N,K) = readLine()!!.split(" ").map(String::toInt)
    val red = N-K
    val blue = K
    var right = 0


    for(i in 1..K){
        var par = 1
        var chi = 1

        for(j in red+1 downTo red+1-i+1){
            par *= j
        }

        for(j in 1..i){
            chi *= j
        }

        println("$par / $chi")
        right = par/chi

        val p = blue - i
        val ka = p * (blue-i)

        println(ka * right)


    }






}


fun gcd(a: Int, b: Int): Int = if(a < b) gcd(b, a) else if(b == 0) a else gcd(b, a % b)
fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)
