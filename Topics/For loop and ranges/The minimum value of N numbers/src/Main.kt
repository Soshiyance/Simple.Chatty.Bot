fun main() {
    // write your code here
    val list = mutableListOf<Int>()
    val nR = readln().toInt()

    for (i in 1..nR) {
        val num = readln().toInt()
        list.add(num)
    }
    println(list.minOrNull())
}
