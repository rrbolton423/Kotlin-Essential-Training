data class ClothingItem(private var _type: String?,
                        val size: String,
                        private var _price: Double) {
//    init {
//        _type = _type?.toUpperCase() ?: "UNKNOWN"
//    }

    var type: String? = _type
        get() = field ?: "Unknown" // Create explicit getter method

    var price = _price
        set(value) { // Create explicit setter method
            field = value * .9
        }

    constructor(size: String, price: Double) : this(null, size, price)

}