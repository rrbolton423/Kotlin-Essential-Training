fun main(args: Array<String>) {

    val stateful = StatefulClass(object : ClickEvent.ClickListener {
        override fun onClick(event: ClickEvent) {
            println("Click at ${event.x}, ${event.y}")
        }
    })
    println("Listener initialized")
    stateful.clickMe(5,18)
    stateful.clickMe(45,57)
}



class ClickEvent(val x: Int, val y: Int) {

    interface ClickListener {
        fun onClick(event: ClickEvent)
    }
}

class StatefulClass(listener: ClickEvent.ClickListener) {
    private var clickListener: ClickEvent.ClickListener? = listener

    fun clickMe(x: Int, y: Int) {
        clickListener?.onClick(ClickEvent(x, y))
    }
}
