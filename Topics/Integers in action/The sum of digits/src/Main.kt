fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val a100 = a / 100
    val a10 = (a / 10) - a100 * 10
    val a1 = a - a100 * 100 - a10 * 10
    val sumDigit = a1 + a10 + a100
    println(sumDigit)
}
