fun main(args: Array<String>){
    val coins = readLine()!!.split(" ")
    val intCoins :IntArray = IntArray(3)
    for(i in coins.indices){
        intCoins[i] = coins[i].toInt()
    }
    val ans :String = if(intCoins[2] <= intCoins[0] + intCoins[1]) "Yes" else "No"
    println(ans)
}
