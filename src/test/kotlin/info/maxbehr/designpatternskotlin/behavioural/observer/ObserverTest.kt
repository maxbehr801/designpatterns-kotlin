package info.maxbehr.designpatternskotlin.behavioural.observer

import kotlin.test.Test

class ObserverTest {

    @Test
    fun testObserver() {
        val editor = Editor()

        val logListener = LogOpenListener("path/to/log/file.txt")
        val emailNotificationListener = EmailNotificationListener("test@test.com")

        editor.events.subscribe("open", logListener)
        editor.events.subscribe("open", emailNotificationListener)
        editor.events.subscribe("save", emailNotificationListener)

        editor.openFile("test.txt")
        editor.saveFile()
    }
}