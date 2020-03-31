package learninglambdahighrorder.arraymapset

fun main() {

    // Map Tutorial: Key-Value pair

    //  var myMap = HashMap<Int, String>()              // Mutable, READ and WRITE both, No Fixed Size
    //  var myMap = mutableMapOf<Int, String>()          // Mutable, READ and WRITE both, No Fixed Size

    var myMap = hashMapOf<Int, String>()            // Mutable, READ and WRITE both, No Fixed Size

    myMap.put(1, "Vikash")
    myMap.put(2, "Pranesh")
    myMap.put(3, "Ashish")

    myMap.put(2, "Viku")

    for (key in myMap.keys) {
        println("Element at $key = ${myMap[key]}")      // myMap.get(key)
    }
}