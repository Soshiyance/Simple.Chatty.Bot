fun main() {
    // write your code here
    val nR = readLine()!!.toInt()
    var j = 0
    var k = 0
    val list = mutableListOf<Int>()
    for (i in 0 until nR) {
        val num = readLine()!!.toInt()
        list.add(num)
    }
    //   println(list)
    for (i in 1 until list.size) {
        if (list[i] >= list[i - 1]) {
            j++
            k = j
        } else j = 0
    }
    println(k + 1)
}