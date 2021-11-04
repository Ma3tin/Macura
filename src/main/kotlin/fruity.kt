import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val vegetable = mutableListOf<String>()
    val newVegetable = mutableListOf<String>()
    val fruit = mutableListOf<String>()
    val newFruit = mutableListOf<String>()
    println("Zadej počet zeleniny: ")
    for (i in 0..sc.nextInt()) vegetable.add(sc.nextLine())
    println("Zadej počet ovoce: ")
    for (i in 0..sc.nextInt()) fruit.add(sc.nextLine())
    var input = sc.nextLine()
    while (input != "END") {
        if (vegetable.contains(input)){
            vegetable.add(input)
            println("zelenina")
            if (newVegetable.contains(input)) {
                println("uz obsahuje")
            } else newVegetable.add(input)
        } else if (fruit.contains(input)){
            fruit.add(input)
            println("ovoce")
            if (newFruit.contains(input)) {
                println("uz obsahuje")
            } else newFruit.add(input)
        } else println("ostatni")
        input = sc.nextLine()
    }
    println(newFruit)
    println(newVegetable)
}