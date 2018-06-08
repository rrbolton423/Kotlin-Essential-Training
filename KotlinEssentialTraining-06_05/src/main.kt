import model.ClothingItem

fun main(args: Array<String>) {

    val cart = mutableMapOf<ClothingItem, Int>()
    cart[ClothingItem("Shirt", "XL", 14.99)] = 2
    cart[ClothingItem("Pants", "32", 19.99)] = 4
    cart[ClothingItem("Hat", "8.5", 24.00)] = 1
    println(cart)

    // Loop through the Map and maintain a running total
    // For each item in the map, display the item's quantity
    // and type, and them the subtotal of that line item

    // At the end of the loop, display the total value of the entire
    // shopping cart
    // Loop through the keys in the map, Java style

    var total: Double = 0.0

    for ((item, quantity) in cart) {
        val price = item.price * quantity
        total = total.plus(price)
        println("Item ${item.type} @ ${item.price} = $price)")
    }
    println("-------------")
    println("Total: $total")

}
