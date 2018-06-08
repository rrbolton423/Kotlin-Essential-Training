import model.ClothingItem

fun main(args: Array<String>) {

    // A map is a collection of key-value pairs.
    // Each key can only occur once in a particular map

    // In Kotlin maps, each item will be created from the
    // "Pair" class
    val colorMap = mapOf<String, Long>(
        Pair("Red", 0xFF0000),
        Pair("Green", 0x00FF00),
        Pair("Blue", 0x0000FF)
    )
    println(colorMap)

    // This is a LinkedHashMap
    println(colorMap::class.simpleName)

    // Create a Mutable map
    val stateMap = mutableMapOf<String, String>()
    stateMap.put("CA", "Sacramento")
    stateMap.put("OR", "Salem")
    stateMap.put("WA", "Olympia")
    println(stateMap)

    // Loop through the keys in the map, Java style
    for (state in stateMap.keys) {
        println("The capital of $state is ${stateMap.get(state)} )")
    }

    // In Kotlin, you can declare the Key and
    // the associated Value, and get those values
    // in the loop
    for ((state, capital) in stateMap) {
        println("The capital of $state is ${capital} )")
    }

    // Create a mutable Map, with a ClothingItem object
    // as the key, and an Int value representing the quantity
    val cart = mutableMapOf<ClothingItem, Int>()
    cart.put(ClothingItem("Shirt", "XL", 14.99), 2)
    cart.put(ClothingItem("Pants", "32", 19.99), 4)
    cart.put(ClothingItem("Hat", "8.5", 24.00), 1)
    println(cart)
}
