package info.maxbehr.designpatternskotlin.structural.facade

class ComplexSystemStore(private val filePath: String) {

    private val cache: HashMap<String, String>

    init {
        println("Reading data from the file: $filePath")
        cache = HashMap()
        // read properties from file and put to cache
    }

    fun store(key: String, value: String) {
        cache[key] = value
    }

    fun read(key: String): String = cache[key] ?: ""

    fun commit() = println("Storing cached data to file $filePath")
}

data class User(val login: String)

class UserFacade {
    private val systemPreferences = ComplexSystemStore("/data/default.prefs")

    fun save(user: User) {
        systemPreferences.store("USER_KEY", user.login)
        systemPreferences.commit()
    }

    fun findFirst() = User(systemPreferences.read("USER_KEY"))
}
