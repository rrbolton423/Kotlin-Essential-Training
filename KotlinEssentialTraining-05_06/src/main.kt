fun main(args: Array<String>) {
    val item = ClothingItem("Shirt", "L", 19.99)
    println(item)

    item.price = 15.99
    println(item)

    val item2 = ClothingItem("M", 14.99)
    println(item2)
    // Print the value coming from the getter function
    println("Item type = ${item2.type}")

    // Use setter method, setting the value to 10
    item2.price = 10.0
    println("Item price = ${item2.price}")

    val person = Person("Joe", "Smith")
    println("That person is ${person.fullName}")
}
