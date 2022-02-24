fun main() {
    // write your code here
    val fNum = readLine()!!.toInt()
    val sNum = readLine()!!.toInt()
    val tNum = readLine()!!.toInt()
    println(fNum in sNum..tNum || fNum in tNum..sNum)
}