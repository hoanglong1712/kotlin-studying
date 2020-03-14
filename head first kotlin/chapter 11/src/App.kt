fun convert(x: Double, converter: (Double) -> Double) : Double {
    val result = converter(x)
    println("$x is converted to $result")
    return result
}


fun main(){
    val e = {x: Int -> x + 5}
    val r = e.invoke(8)
    val addFive: (Int) -> Int = { it + 5}

    println(addFive.invoke(1))

    val lambdas: () -> Unit = { println("something")}
    lambdas

    val fahrenheit = convert(20.0, { c: Double -> c * 1.8 + 32 })
    println(fahrenheit)

    convert(20.0){it * 1.8 + 32}


    val ints = listOf(1, 2, 3)
    val sumOfInts = ints.fold(0) { runningSum, item -> runningSum + item }
    println(sumOfInts)

}

