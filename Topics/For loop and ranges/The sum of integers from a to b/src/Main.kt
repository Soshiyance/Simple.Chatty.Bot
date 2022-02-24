fun main() {
    // put your code here
    val minR = readln().toInt()
    val maxR = readln().toInt()
    var sum = 0
    for (i in minR..maxR) {
        sum += i
    }
    println(sum)
}