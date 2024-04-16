package info.maxbehr.designpatternskotlin.creational.factorymethod

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

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