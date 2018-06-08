fun main(args: Array<String>) {

    // Code blocks using the conditional keywords "if"
    // and "else" are used to evaluate simple conditions
    // and syntactically are identical in form to Java

    print("Enter a state abbreviation: ")
    val state = readLine()

    if (state == "CA") println("The capital is Sacramento")
    else if (state == "OR") println("The capital is Salem")
    else println("I don't know that state")

}