
fun main(args :Array<String>){
    val input :List<String> = readLine()!!.split(" ")
    val height :Int = input[0].toInt()
    val width :Int = input[1].toInt()
    var s : List<List<String>> = (0 .. height-1).map { readLine()!!.split("") }
    var mark : ArrayList<ArrayList<Boolean>> = ArrayList<ArrayList<Boolean>>(
            (0 .. height-1).map {
                ArrayList<Boolean>(
                        (0 .. width-1).map { false }
                )
            }
    )
    for(i in 0..height){
        for(j in 0..width){
            println(s[i][j])
            if(s[i][j] == "s"){
                search(s,i,j,mark)
            }
        }
    }
    println("No")

}

fun search(s :List<List<String>>, i :Int, j:Int ,m :ArrayList<ArrayList<Boolean>>){
    println("in the house")
    if(s[i][j] == "#" && m[i][j] == false){
        m[i][j]=true
    }
    else if(s[i][j] == "g"){
        println("Yes")
    }
    else if(s[i][j] == "."){
        search(s,i+1,j,m)
        search(s,i-1,j,m)
        search(s,i,j+1,m)
        search(s,i,j-1,m)
    }
}
