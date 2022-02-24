fun main() {
    // put your code here
    val min = readLine()!!.toLong()
    val max = readLine()!!.toLong()
    var multi = 1L
    for (i in min until max) {
        multi *= i
    }
    println(multi)
}