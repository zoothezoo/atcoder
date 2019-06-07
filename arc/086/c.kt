fun main(args: Array<String>){
    val (N,K) = readLine()!!.split(" ").map(String::toInt)
    val A = readLine()!!.split(" ").map(String::toInt).toMutableList()

    val map = mutableMapOf<Int, Int>()

    for(i in 0..A.size-1){
        if(map.containsKey(A[i])){
            map[A[i]] = count+1
        }
        else{
            var count = 1
            map[A[i]] = count
        }
    }
    println(map!!)
}
