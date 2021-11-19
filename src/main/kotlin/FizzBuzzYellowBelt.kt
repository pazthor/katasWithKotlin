class FizzBuzzYellowBelt {
    val list =  1..100
}

fun yellowBelt(): List<String> {
    val listInteger = (1..100).map { it}

    val result = listInteger.map {
        fizzBuzz(it)
    }
return result
}

fun fizzBuzz(element: Int):String {

    if (element%3 == 0 && element%5 != 0) return  "Fizz"
    if(element%5 == 0 && element%3 != 0) return "Buzz"
    if(element %5 ==0 && element%3==0) return "FizzBuzz"
    return element.toString()
}
