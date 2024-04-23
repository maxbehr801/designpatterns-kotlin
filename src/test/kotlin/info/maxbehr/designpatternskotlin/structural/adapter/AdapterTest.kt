package info.maxbehr.designpatternskotlin.structural.adapter

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.jupiter.api.Test

class AdapterTest {

    @Test
    fun adapterTest() {
        val generator = DatabaseDataGenerator()
        val generateData = generator.generateData()
        val adapter = DataDisplayAdapter(DataDisplay())
        val convertData = adapter.convertData(generateData)

        assertThat(convertData.size).isEqualTo(3)
        assertThat(convertData[1].index).isEqualTo(3f)
        assertThat(convertData[1].data).isEqualTo("7")
    }
}