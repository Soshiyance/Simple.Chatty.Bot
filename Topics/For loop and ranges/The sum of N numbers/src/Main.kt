fun main() {
    // write your code here
    val rang = readLine()!!.toInt()
    var sum = 0
    for (i in 1..rang) {
        val num = readLine()!!.toInt()
        sum += num
    }
    println(sum)
}