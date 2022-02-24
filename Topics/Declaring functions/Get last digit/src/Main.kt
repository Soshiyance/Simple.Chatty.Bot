// write your code here

/* Do not change code below */
fun getLastDigit(num: String) = num[num.length - 1]

fun main() {
    val a = readLine()!!
    println(getLastDigit(a))
}