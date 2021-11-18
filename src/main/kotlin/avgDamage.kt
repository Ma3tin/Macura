import java.util.*
import kotlin.math.ceil

fun main() {
    /**
     * Program načíta inputy dokud uživatel nezdá "END"
     */
    val sc = Scanner(System.`in`)
    var userInputs = sc.nextLine()
    val arrayOfInputs = mutableListOf<String>()
    while (!userInputs.equals("END")) {
        /**
         * Inputy ukládá do listu stringů
         */
        arrayOfInputs.add(userInputs)
        userInputs = sc.nextLine()
    }

    var total = 0
    /**
     * Cyklem program projede všechny věci v poli
     */
    for (i in arrayOfInputs.indices) {
        /**
         * pokud je daný prvek číslo přidá do součtu všech čísel
         */
        if (arrayOfInputs[i].toIntOrNull() != null) total += arrayOfInputs[i].toInt()
        /**
         * Pokud není zkontroluje zda indexy -1,-2,+1,+2 nejsou mimo list
         * Pokud nejsou přidá tam hodnotu na daným indexu
         * Pokud jsou mimo přidá tam nulu
         */
        else {
            var totalIfIsDamagedInput = 0
            if ((i - 1) >= 0 && (i - 1) <= arrayOfInputs.size) if (arrayOfInputs[i - 1].toIntOrNull() != null) {
                totalIfIsDamagedInput += arrayOfInputs[i - 1].toInt()
            }
            if ((i - 2) >= 0 && (i - 2) <= arrayOfInputs.size) if (arrayOfInputs[i - 2].toIntOrNull() != null) {
                totalIfIsDamagedInput += arrayOfInputs[i - 2].toInt()
            }
            if ((i + 1) >= 0 && (i + 1) <= arrayOfInputs.size) if (arrayOfInputs[i + 1].toIntOrNull() != null) {
                totalIfIsDamagedInput += arrayOfInputs[i + 1].toInt()
            }
            if ((i + 2) >= 0 && (i + 2) <= arrayOfInputs.size) if (arrayOfInputs[i + 2].toIntOrNull() != null) {
                totalIfIsDamagedInput += arrayOfInputs[i + 2].toInt()
            }
            /**
             * všechny hodnoty se sečtou a pak zaokrouhlí nahoru a přidají se do celkové sumy
             */
            total += ceil((totalIfIsDamagedInput / 4f)).toInt()
        }
    }
    /**
     * nakonec se vypíše celkový aritmetický průměr všech čísel
     */
    println(total / arrayOfInputs.size)
}