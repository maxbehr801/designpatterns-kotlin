package info.maxbehr.designpatternskotlin.creational.singleton

object Singleton {

    init {
        println("creating a new instance: $this")
    }

    fun showYourself(): Singleton = apply { println("This is me: ${this.hashCode()}") }
}