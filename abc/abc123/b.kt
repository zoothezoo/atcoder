fun main(args: Array<String>){
	val ina = readLine()!!.split(" ")
	val inb = readLine()!!.split(" ")
	val inc = readLine()!!.split(" ")
	var list = mutableListOf<Int>()

	list.add(ina[0].toInt())
	list.add(ina[1].toInt())
	list.add(inb[0].toInt())
	list.add(inb[1].toInt())
	list.add(inc[0].toInt())
	list.add(inc[1].toInt())

	var co1 = 0
	var co2 = 0
	var co3 = 0
	var co4 = 0

	for(i in 0..5){
		when(list[i]){
			1-> co1++
			2-> co2++
			3-> co3++
			4-> co4++
		}
	}

	if(co1 > 2 || co2 > 2 || co3 > 2 || co4 > 2){
		println("NO")
	}
	else{
		println("YES")
	}
}
