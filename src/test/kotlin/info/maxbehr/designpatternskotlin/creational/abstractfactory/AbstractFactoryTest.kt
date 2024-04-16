package info.maxbehr.designpatternskotlin.creational.abstractfactory

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class AbstractFactoryTest {

    @Test
    fun abstractFactoryTest() {
        val dataSourceFactory = DataSourceFactory.createFactory<DatabaseDataSource>()
        val dataSource = dataSourceFactory.makeDataSource()
        println("created datasource $dataSource")

        assertThat(dataSource).isInstanceOf(DatabaseDataSource::class.java)
    }
}