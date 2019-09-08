fun main(args: Array<String>) {
    val n = readLine()!!
    var count = 0

    for (i in 0..3) {
        when (n[i]) {
            '0', '6', '9' -> count++
            '8' -> count += 2
            else -> count += 0
        }
    }

    println(count)
}
