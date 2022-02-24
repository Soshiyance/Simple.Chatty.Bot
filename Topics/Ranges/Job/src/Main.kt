fun main() {
    // write your code here
    val age = readLine()!!.toInt()
    val jobChecker = age in 18..59
    println(jobChecker)
}