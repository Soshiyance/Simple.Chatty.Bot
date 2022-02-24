fun main() {
    // write your code here
    val minR = readln().toInt()
    val maxR = readln().toInt()
    for (i in minR..maxR) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else if (i % 5 == 0) {
            println("Buzz")
        } else if (i % 3 == 0) {
            println("Fizz")
        } else println(i)
    }
}