fun main(args: Array<String>){
    val st = readLine()!!
    var list = mutableListOf<Int>()

    repeat(6){
        list.add(0)
    }

    for(i in 0..st.length-1){
    when(st[i]){
        'A' -> list[0]++
        'B' -> list[1]++
        'C' -> list[2]++
        'D' -> list[3]++
        'E' -> list[4]++
        'F' -> list[5]++
    }
}

    for(i in 0..4){
        print("${list[i]} ")
    }
    println(list[5])

}