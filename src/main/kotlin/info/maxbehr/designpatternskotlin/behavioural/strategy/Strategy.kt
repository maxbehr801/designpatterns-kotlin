package info.maxbehr.designpatternskotlin.behavioural.strategy

import java.util.*

class Printer(private val stringFormatterStrategy: (String) -> String) {

    fun printString(message: String) {
        println(stringFormatterStrategy(message))
    }
}

val lowercaseFormatter = {it: String -> it.lowercase(Locale.getDefault()) }
val uppercaseFormatter = {it: String -> it.uppercase(Locale.getDefault()) }