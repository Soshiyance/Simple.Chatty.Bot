fun main() {
    // write your code here
    val minR1 = readLine()!!.toInt()
    val maxR1 = readLine()!!.toInt()
    val minR2 = readLine()!!.toInt()
    val maxR2 = readLine()!!.toInt()
    val num = readLine()!!.toInt()
    val check = num in minR1..maxR1 && num in minR2..maxR2
    println(check)
}