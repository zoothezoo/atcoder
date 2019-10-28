fun main(args: Array<String>){
  val input = readLine()!!.toInt()
  var list = readLine()!!.split(" ")
  val tako = mutableListOf<Int>()
  
  for(i in 0..input-1){
    tako.add(list[i].toInt())
  }
  
  var bimi = 0
  
  for(i in 0..input-2){
    for(j in i+1..input-1){
        bimi += tako[i] * tako[j]
    }  
  }
  println(bimi)
}
