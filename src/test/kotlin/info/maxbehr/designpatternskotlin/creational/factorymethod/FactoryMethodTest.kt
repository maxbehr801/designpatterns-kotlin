package info.maxbehr.designpatternskotlin.creational.factorymethod

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class FactoryMethodTest {

    @Test
    fun testCurrency() {
        val canadaCurrency = CurrencyFactory.currencyForCountry(Country.Canada).currencyCode
        assertThat(canadaCurrency).isEqualTo("CAD")

        val spainCurrency = CurrencyFactory.currencyForCountry(Spain).currencyCode
        assertThat(spainCurrency).isEqualTo("EUR")

        val greekCurrency = CurrencyFactory.currencyForCountry(Greece("")).currencyCode
        assertThat(greekCurrency).isEqualTo("EUR")

        val usaCurrency = CurrencyFactory.currencyForCountry(USA("")).currencyCode
        assertThat(usaCurrency).isEqualTo("USD")
    }
}