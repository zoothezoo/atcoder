fun main(args: Array<String>){
    val s :String? = readLine()
    if(s != null){
        val str :String? = if(s[0] != s[1] && s[1] != s[2] && s[0] != s[2]) "Yes" else "No"
        println(str)
    }
}
