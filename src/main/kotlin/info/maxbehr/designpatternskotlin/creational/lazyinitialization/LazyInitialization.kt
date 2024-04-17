package info.maxbehr.designpatternskotlin.creational.lazyinitialization

class EagerInitialization {
    val box = AlertBox()
    fun showMessage(message: String) {
        box.message = message
        box.show()
    }
}

class LazyInitializationByLazy {
    // only with val
    val box by lazy { AlertBox() }
    fun showMessage(message: String) {
        box.message = message
        box.show()
    }
}

class LazyInitializationLateInit {
    // must be instantiated
    lateinit var box: AlertBox
    fun showMessage(message: String) {
        box = AlertBox()
        box.message = message
        box.show()
    }
}

class AlertBox {
    var message: String? = null
    fun show() {
        println("AlertBox $this: $message")
    }
}