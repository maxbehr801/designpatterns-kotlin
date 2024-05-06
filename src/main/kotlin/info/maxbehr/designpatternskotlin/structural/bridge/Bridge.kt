package info.maxbehr.designpatternskotlin.structural.bridge

interface Device {
    var volume: Int
    fun getName(): String
}

class Radio: Device {
    override var volume = 0
    override fun getName(): String {
        return "Radio $this"
    }
}

class TV: Device {
    override var volume = 0
    override fun getName(): String {
        return "TV $this"
    }
}

interface Remote {
    fun volumeUp()
    fun volumeDown()
}

class BasicRemote(val device: Device): Remote {
    override fun volumeUp() {
        device.volume++
        println("${device.getName()} volume up: ${device.volume}")
    }
    override fun volumeDown() {
        device.volume--
        println("${device.getName()} volume down: ${device.volume}")
    }
}