data class nums(var name: String,var count: Int)

fun main(args: Array<String>){
    val (N,K) = readLine()!!.split(" ").map(String::toInt)
    val list = readLine()!!.split(" ")

    val numlist = mutableListOf<nums>()

    numlist.add(nums(name = list[0], count = 1))

    for(i in 1..list.size-1){
        var flag = false

        for(j in 0..numlist.size-1){
            if(list[i] == numlist[j].name){
                numlist[j].count++
                flag = true
                break
            }
        }
        if(!flag){
            numlist.add(nums(name = list[i], count = 1))
        }
    }






}
