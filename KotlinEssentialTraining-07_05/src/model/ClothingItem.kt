package model

// All sub classes of a sealed class must be defined
// in the same code file as the sealed class. They can either
// be defined as nested classes, or they can be defined
// independently outside of the sealed class's code block.
sealed class ClothingItem(val type: String) {
    abstract val size: String
    abstract val price: Double
}

// The subclasses can be data classes
data class Shirt(override var size:String,
                 override var price:Double)
: ClothingItem("Shirt")

data class Pants(override var size:String,
                 override var price:Double)
    : ClothingItem("Pants")