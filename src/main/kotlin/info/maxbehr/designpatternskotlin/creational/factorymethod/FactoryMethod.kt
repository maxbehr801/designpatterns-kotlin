package info.maxbehr.designpatternskotlin.creational.factorymethod

sealed class Country {
    object Canada: Country()
}

object Spain: Country()

class Greece(val someProperty: String): Country()

data class USA(val someProperty: String): Country()

class Currency(val currencyCode: String)

object CurrencyFactory {
    fun currencyForCountry(country: Country): Currency =
        when (country) {
            is Spain -> Currency("EUR")
            is Greece -> Currency("EUR")
            is USA -> Currency("USD")
            is Country.Canada -> Currency("CAD")
        }
}