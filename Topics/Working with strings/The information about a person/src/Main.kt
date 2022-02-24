fun main() {
    // put your code here
    val (firstName, lastName, age) = readLine()!!.split(" ")
    print("${firstName[0]}. $lastName, $age years old")
}