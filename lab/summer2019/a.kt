fun main(args: Array<String>){
    val n = readLine()!!

    if(n[0]!=n[1]){
        if(n[0] == n[2]){
            println("Yes")
            return
        }
    }
    println("No")
}