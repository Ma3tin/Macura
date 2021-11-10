import java.util.*
import kotlin.math.*

fun main() {
    val sc = Scanner(System.`in`)
    val input = sc.nextInt()
    for (i in 0..input) {
        var rn = 0.0
        for (j in i.toString()) {
            val a = j.digitToInt().toDouble()
            val b = i.toString().length.toDouble()
            rn += Math.pow(a, b)
            if (rn == i.toDouble()) {
                println(i)
                rn = 0.0
            }
            else if (rn > i.toDouble()) break
        }
    }
}