// write your function here
fun isVowel(x: Char): Boolean {
    return (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u' || x == 'A' || x == 'E' || x == 'I' || x == 'O' || x == 'U')
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}