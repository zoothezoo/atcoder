import java.util.ArrayList
fun main(args :Array<String>){
    val N :Int = readLine()!!.toInt()
    val name : ArrayList<String> = ArrayList(N)
    var m :Long= 0
    var a :Long= 0
    var r :Long= 0
    var c :Long= 0
    var h :Long= 0
    var sum :Long
    var ans :Long = 0
    repeat(N){
        name.add(readLine()!!)
    }
    for(i in name.indices){
        if(name[i].get(0) == 'M'){
            m++
        }
        if(name[i].get(0) == 'A'){
            a++
        }
        if(name[i].get(0) == 'R'){
            r++
        }
        if(name[i].get(0) == 'C'){
            c++
        }
        if(name[i].get(0) == 'H'){
            h++
        }
    }
    //println("$m $a $r $c $h")
    val march : List<Long> = listOf(m ,a ,r ,c ,h)
    for(x in march.indices){
        for(y in march.indices){
            for(z in march.indices){
                if(x != y && x != z && y != z){
                    sum = 0
                    sum = march[x] * march[y] * march[z]
                    ans += sum
                    
                }
            }
        }
    }
    println(ans / 6)

}
