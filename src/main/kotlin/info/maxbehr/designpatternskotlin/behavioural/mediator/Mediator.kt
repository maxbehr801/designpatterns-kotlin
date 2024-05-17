package info.maxbehr.designpatternskotlin.behavioural.mediator

class ChatUser(private val mediator: Mediator, private val name: String) {
    fun send(msg: String) {
        println("$name: Sending msg: $msg")
        mediator.sendMessage(msg, this)
    }

    fun receive(msg: String) {
        println("$name: Received msg: $msg")
    }
}

class Mediator {
    private val users = arrayListOf<ChatUser>()

    fun sendMessage(msg: String, user: ChatUser) {
        users
            .filter { it != user }
            .forEach { it.receive(msg) }
    }

    fun addUser(user: ChatUser): Mediator = apply { users.add(user) }
}