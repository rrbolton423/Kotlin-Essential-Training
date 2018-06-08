// Primary constructor, cannot have it's own implementation block
data class ClothingItem(var type: String?,
                        val size: String,
                        var price: Double) {

    // This code is executed when the primary constructor is called
    init {
        type = type?.toUpperCase() ?: "Unknown"
    }

    // Secondary constructor, chain the constructor to the
    // primary constructor by using the "this" keyword and
    // passing the required arguments

    constructor(size: String, price: Double) : this(null, size, price) {
        // Secondary constructors can have it's own implementation block
//        type = "Unknown"
    }

}