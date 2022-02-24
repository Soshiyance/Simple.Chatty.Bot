// write your code here
fun divide(y: Long, z: Long): Double {
    return y.toDouble() / z.toDouble()
}

/* Do not change code below */
fun main() {
    val a = readLine()!!.toLong()
    val b = readLine()!!.toLong()
    println(divide(a, b))
}