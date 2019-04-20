fun main(args: Array<String>){
    val n = readLine()!!.toInt()
    var s = readLine()!! 
    val k = readLine()!!.toInt()

    var point = s[k-1]

    var list = mutableListOf<Char>()


    for(i in 0..n-1){
        if(s[i] != point){
            list.add('*')
        }
        else{
            list.add(s[i])

        }

    }

for(i in 0..n-1){
    print(list[i])
}
println()
}