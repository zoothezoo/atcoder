fun main(args: Array<String>){
    val s = readLine()!!


    for(i in 0..2) {
        val a = s[i]
        var aco = 1
        var bco = 1
        for(j in i+1..3){
            val b = s[j]
            if(i == j){
                break
            }
            if(a == s[j]){
                aco++
            }
            else if(b == s[j]){
                bco++
            }

            if(aco == 2 && bco == 2){
                println("Yes")
                return
            }
        }
    }
    println("No")
}


fun gcd(a: Int, b: Int): Int = if(a < b) gcd(b, a) else if(b == 0) a else gcd(b, a % b)
fun lcm(a: Int, b: Int): Int = (a * b) / gcd(a, b)
