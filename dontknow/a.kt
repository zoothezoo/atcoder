fun main(args: Array<String>){
	val input = readLine()!!.split(" ")
		val n = input[0].toInt()
		val k = input[1].toInt()
	if(n % 2 == 0){
		if(n/2 >= k){
			println("YES")
}
else{
			println("NO")

}
}
	else{
		if((n+1)/2 >= k){
			println("YES")
}
else{
			println("NO")

}
}
		
}
