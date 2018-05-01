/*fun nextLine(): String {
    val line: String? = readLine()
    if(line == null) {
        return ""
    }
    return line
}

fun nextInt(): Int {

}
*/

fun main(args: Array<String>){
    val fare : IntArray = IntArray(4)
    //val fare1: Array<Int> = arrayOfNulls(3)
    //if(fare != null)
    for(i in fare.indices){
        //fare[i] = Integer.parseInt(readLine()!!)
        fare[i] = readLine()!!.toInt()
    }
    val bus = if(fare[0] >= fare[1]) fare[1] else fare[0]
    val train = if(fare[2] >= fare[3]) fare[3] else fare[2]
    val sum = bus + train
    println(sum)
}
