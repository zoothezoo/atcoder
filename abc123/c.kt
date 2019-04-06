fun main(args: Array<String>){
    val N = readLine()!!.toLong()
    val input : MutableList<Long> = mutableListOf()
    repeat(5){
        input.add(readLine()!!.toLong())
    }

    var count: Long = 0L
    input.sort()
    if(N % input[0] == 0L){
        count +=  N / input[0]
        println(4L + count)
    }
    else{
        count += N / input[0]
        println(5L + count)
    }
}
