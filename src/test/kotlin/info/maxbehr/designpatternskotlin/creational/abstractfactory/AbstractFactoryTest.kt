package info.maxbehr.designpatternskotlin.creational.abstractfactory

import assertk.assertThat
import assertk.assertions.isInstanceOf
import kotlin.test.Test

class AbstractFactoryTest {

    @Test
    fun abstractFactoryTest() {
        val dataSourceFactory = DataSourceFactory.createFactory<DatabaseDataSource>()
        val dataSource = dataSourceFactory.makeDataSource()
        println("created datasource $dataSource")

        assertThat(dataSource).isInstanceOf(DatabaseDataSource::class.java)
    }
}