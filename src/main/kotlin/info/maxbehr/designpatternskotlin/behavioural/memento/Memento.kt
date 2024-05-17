package info.maxbehr.designpatternskotlin.behavioural.memento

data class Memento(val state: String)

class Originator(var state: String) {
    fun createMemento() = Memento(state)
    fun restoreMemento(memento: Memento) {
        state = memento.state
    }
}

class CareTaker {
    private val mementoList = arrayListOf<Memento>()

    fun saveSate(state: Memento) {
        mementoList.add(state)
    }

    fun restoreSate(index: Int): Memento = mementoList[index]
}