fun main() {
    // write your code here
    val nR = readln().toInt()
    val list = mutableListOf<Int>()
    var ans = ""
    for (i in 1..nR) {
        val num = readln().toInt()
        list.add(num)
    }
    if (nR == 1) {
        println("YES")
    }
    else {
        for (i in 0 until list.size - 1) {
            if (list[i] < list[i + 1]) {
                ans = "YES"

            } else {
                ans = "NO"
                break
            }
        }
        println(ans)
    }
}