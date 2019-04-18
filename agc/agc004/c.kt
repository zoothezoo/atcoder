import java.util.*
fun main(args: Array<String>){
    val input = readLine()!!.split(" ")
    val H = input[0].toInt()
    val W = input[1].toInt()

    val purple : ArrayList<String> = arrayListOf<String>()

    for(i in 0..H-1){
        purple.add(readLine()!!)
    }

    val red : ArrayList<String> = arrayListOf<String>()
    val blue : ArrayList<String> = arrayListOf<String>()

    for(i in 0..H-1){
        red.add("")
        blue.add("")
        if(i % 2 == 0){
            for(j in 0..W-2){
                red[i] += "#"
                if(purple[i][j] == '#'){
                    blue[i] += "#"
                }
                else{
                    blue[i] += "."
                }
            }
            red[i] += "."
            blue[i] += "#"
        }
        else{
            red[i] += "#"
            blue[i] += "."
            for(j in 1..W-1){
                if(purple[i][j] == '#'){
                    red[i] += "#"
                }
                else{
                    red[i] += "."
                }
                blue[i] += "#"
            }
        }
    }
    for(i in 0..H-1){
        println(red[i])
    }
    println()
    for(i in 0..H-1){
        println(blue[i])
    }
}
