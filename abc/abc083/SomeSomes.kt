fun main(args: Array<String>){
    val ( num , small , large) = readLine()!!.split(" ").map(String::toInt)
    var sum : Int = 0
    var ketasum :Int = 0
    //println(num)
    for(i in 1..num){
        var number :Int= i
        //println("number : "+ number)
        while(number / 10 != 0){
            var dig =number % 10
            ketasum += dig
            number /= 10
        }
        ketasum = ketasum + number
        //println(ketasum)
        if(ketasum >= small && ketasum <= large){
            sum += i
            //println("sum :" + sum)
        }
        ketasum = 0
    }
    println(sum)
}
