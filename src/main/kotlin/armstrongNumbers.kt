import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    for (i in 0..sc.nextInt()) if (isArmstrongNumber(i)) println(i)

}

fun isArmstrongNumber(inputNumber: Int):Boolean {
    var summary = 0.0
    for (j in inputNumber.toString()) summary += Math.pow(j.digitToInt().toDouble(), inputNumber.toString().length.toDouble())
    return (summary == inputNumber.toDouble())
}