fun main(args: Array<String>) {

    // If you have to build a complex String that might
    // require multiple concatenation operations,
    // use the StringBuilder class

    val builder = StringBuilder("To be or not to be\n")
            .append("that is the question\n")
            .append("Whether 'tis nobler in the mind\n")
            .append("to suffer the slings and arrows")

    val result = builder.toString()
    println(result)
}