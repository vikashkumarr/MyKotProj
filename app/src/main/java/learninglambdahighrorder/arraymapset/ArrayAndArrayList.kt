package learninglambdahighrorder.arraymapset

fun main() {

//    var list = mutableListOf<String>()  // Mutable, No Fixed Size, Can Add or Remove Elements
//    var list = arrayListOf<String>()    // Mutable, No Fixed Size, Can Add or Remove Elements

    var list = ArrayList<String>()      // Mutable, No Fixed Size, Can Add or Remove Elements
    list.add("Vikash")
    list.add("Pranesh")
    list.add("Ashish")

//    list.remove("Manmohan")
//    list.add("Vajpayee")

    list[1] = "Kumar"

    for (element in list) {             // Using individual elements (Objects)
        println(element)
    }

}