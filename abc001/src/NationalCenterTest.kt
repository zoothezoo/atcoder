fun main(args: Array<String>){
    val num = readLine()!!.toInt()
    val input = readLine()!!
    val nums = mutableListOf<Int>()

    for(i in 0..num-1) {
        nums.add(input[i].toString().toInt())
    }

    var co1 = 0
    var co2 = 0
    var co3 = 0
    var co4 = 0

    for (i in nums.indices) {
        when (nums[i]) {
            1 -> co1++
            2 -> co2++
            3 -> co3++
            4 -> co4++
        }
    }

    var list = mutableListOf<Int>()

    list.add(co1)
    list.add(co2)
    list.add(co3)
    list.add(co4)

    // val Max = o4,maxOf(co1,co2,co3))
    // val Min = minOf(co4,minOf(co1,co2,co3))

    val listed = list.sorted()

    println("${listed[3]} ${listed[0]}")
}