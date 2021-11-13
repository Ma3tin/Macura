import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    for (i in 0..input) {
        if (isArmstrongNumber(i)) println(i)
    }
}

fun isArmstrongNumber(inputNumber: Int):Boolean {
    var rn = 0.0
    for (j in inputNumber.toString()) {
        val a = j.digitToInt().toDouble()
        val b = inputNumber.toString().length.toDouble()
        rn += Math.pow(a, b)
        if (rn == inputNumber.toDouble()) return true
    }
    return false
}
