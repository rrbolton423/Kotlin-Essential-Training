fun main(args: Array<String>) {
//    print("Enter a state abbreviation: ")
//    val state = readLine()

//    if (state == "CA") {
//        println("The capital is Sacramento")
//    } else if (state == "OR") {
//        println("The capital is Salem")
//    } else {
//        println("I don't know that state")
//    }

//    val capital: String?
//    when (state) {
//        "CA" -> capital = "Sacramento"
//        "OR" -> capital = "Salem"
//        else -> capital = "Unknown"
//    }

//    val capital: String = when (state) {
//        "CA" -> "Sacramento"
//        "OR" -> "Salem"
//        else -> "Unknown"
//    }
//    println("The capital is $capital")
//
//    // Can evaluate multiple expressions
//    when (state) {
//        "CA", "OR", "WA" -> println("West Coast")
//        "NH", "VT", "MA" -> println("New England")
//        else -> println("Somewhere else")
//    }

    // If you're evaluating a mathematical expression, you
    // can match a value to a range that's preceded by the
    // the keyword "in"
    val theAnswer = 50
    when (theAnswer) {
        in 1..39 -> println("Not yet")
        in 40..45 -> println("Close enough")
        else -> {
            println("Definitely not")
            println("No, really!")
        }
    }
}