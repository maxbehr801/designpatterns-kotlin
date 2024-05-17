package info.maxbehr.designpatternskotlin.behavioural.observer

import java.io.File

interface EventListener {
    fun update(eventType: String?, file: File?)
}

class EventManager(vararg operations: String) {
    var subscribers = hashMapOf<String, ArrayList<EventListener>>()

    init {
        for (operation in operations) {
            subscribers[operation] = ArrayList<EventListener>()
        }
    }

    fun subscribe(eventType: String?, listener: EventListener) {
        val eventTypeSubscribers = subscribers.get(eventType)
        eventTypeSubscribers?.add(listener)
    }

    fun unsubscribe(eventType: String?, listener: EventListener) {
        val eventTypeSubscribers = subscribers.get(eventType)
        eventTypeSubscribers?.remove(listener)
    }

    fun notify(eventType: String?, file: File?) {
        val eventTypeSubscribers = subscribers.get(eventType)
        eventTypeSubscribers?.let {
            for (listener in it) {
                listener.update(eventType, file)
            }
        }
    }
}

class Editor {
    var events = EventManager("open", "save")

    private var file: File? = null

    fun openFile(filePath: String) {
        file = File(filePath)
        events.notify("open", file)
    }

    fun saveFile() {
        file?.let {
            events.notify("save", file)
        }
    }
}

class EmailNotificationListener(private val email: String): EventListener {
    override fun update(eventType: String?, file: File?) {
        println("email to $email: someone has performed $eventType operation with the file ${file?.name}")
    }
}

class LogOpenListener(var filename: String): EventListener {
    override fun update(eventType: String?, file: File?) {
        println("save to log $filename: Someone has performed $eventType operation with the file ${file?.name}")
    }
}