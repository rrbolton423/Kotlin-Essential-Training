class MathLib {

    // Any members that I place within this
    // companion object will be accessible from
    // the MathLib class
    companion object {

        // This function can be called from anywhere
        // within the application. The default visibility
        // for member functions is public
        fun addValues(number1: Double, number2: Double) = number1 + number2

        fun getInput(prompt: String): Double {
            print(prompt)
            val string: String? = readLine()
            val number = string!!.toDouble()
            return number
        }
    }
}