fun main() {
    // write your code here
    val list = mutableListOf<Int>()
    val nR = readln().toInt()
    // val max1:Int?
    val multi: Int?
    for (i in 1..nR) {
        val num = readln().toInt()
        list.add(num)
    }
    if (nR == 1) println(list[0]) else {
        val max1 = list.maxOrNull()
        list.remove(max1)
        val max2: Int? = list.maxOrNull()
        if (max1 != null) {
            multi = max1 * max2!!
            println(multi)
        }
    }
}