import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val stringInput = ("Austrálie|dolar|1|AUD|16,225\n" +
            "Brazílie|real|1|BRL|3,997\n" +
            "Bulharsko|lev|1|BGN|12,979\n" +
            "Čína|žen-min-pi|1|CNY|3,400\n" +
            "Dánsko|koruna|1|DKK|3,412\n" +
            "EMU|euro|1|EUR|25,385\n" +
            "Filipíny|peso|100|PHP|43,190\n" +
            "Hongkong|dolar|1|HKD|2,813\n" +
            "Chorvatsko|kuna|1|HRK|3,381\n" +
            "Indie|rupie|100|INR|29,070\n" +
            "Indonesie|rupie|1000|IDR|1,550\n" +
            "Island|koruna|100|ISK|16,969\n" +
            "Izrael|nový šekel|1|ILS|6,793\n" +
            "Japonsko|jen|100|JPY|19,282\n" +
            "Jižní Afrika|rand|1|ZAR|1,479\n" +
            "Kanada|dolar|1|CAD|17,679\n" +
            "Korejská republika|won|100|KRW|1,846\n" +
            "Maďarsko|forint|100|HUF|7,070\n" +
            "Malajsie|ringgit|1|MYR|5,268\n" +
            "Mexiko|peso|1|MXN|1,064\n" +
            "MMF|ZPČ|1|XDR|30,840\n" +
            "Norsko|koruna|1|NOK|2,592\n" +
            "Nový Zéland|dolar|1|NZD|15,381\n" +
            "Polsko|zlotý|1|PLN|5,555\n" +
            "Rumunsko|leu|1|RON|5,128\n" +
            "Rusko|rubl|100|RUB|30,542\n" +
            "Singapur|dolar|1|SGD|16,229\n" +
            "Švédsko|koruna|1|SEK|2,535\n" +
            "Švýcarsko|frank|1|CHF|23,754\n" +
            "Thajsko|baht|100|THB|65,894\n" +
            "Turecko|lira|1|TRY|2,392\n" +
            "USA|dolar|1|USD|21,882\n" +
            "Velká Británie|libra|1|GBP|30,002\n" +
            "Ceska Republika|koruna|1|CZK|1").replace(",",".")

    val map = mutableMapOf<String, Float>()
    for (i in stringInput.split("\n")) {
        val split = i.split("|")
        map[split[3]] = (split[4].toFloat()/split[2].toInt())
    }



    while(sc.hasNext()) {
        val input = sc.nextLine().split(" ")
        val count = input[0].toFloat()
        val currency = input[1].uppercase()
        val currency1 = input[2].uppercase()
        if(!map.containsKey(currency) || !map.containsKey(currency1)) {
            println("Invalid currency")
            continue
        }
        println(count/ map[currency1]!! * map[currency]!!)
    }


}