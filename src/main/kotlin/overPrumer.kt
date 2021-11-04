import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var arr = mutableListOf<Int>()
    while (sc.hasNext()) arr.add(sc.nextInt())
    var total = 0
    for (i in 0 until arr.size) total += arr[i]
    total /= arr.size
    for (i in 0 until arr.size) if (arr[i] >= total) println(arr[i])
}