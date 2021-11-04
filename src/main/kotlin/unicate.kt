import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val arr = mutableListOf<Int>()
    val set = mutableSetOf<Int>()
    var input = sc.nextLine().uppercase()
    //var totalUnicate = 0;
    //var counter = 0;
    while (input != "END") {
        arr.add(input.toInt())
        set.add(input.toInt())
        input = sc.nextLine().uppercase()
    }
    println(arr)

    /*
    for (j in 0 until arr.size) {
        arr.sort()
        if (arr.contains(arr[j])) counter++
        if (arr[j] != arr[j - 1]) {
            if (counter == 1) {
                totalUnicate++
                counter = 0;
            }
        }
    }
    println(counter)
     */





    println(set.size)
}