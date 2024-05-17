package info.maxbehr.designpatternskotlin.behavioural.visitor

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class VisitorTest {

    @Test
    fun testVisitor() {
        val projectAlpha = FixedPriceContract(10000L)
        val projectBeta = SupportContract(500L)
        val projectGamma = TimeAndMaterialsContract(150, 10)
        val projectKappa = TimeAndMaterialsContract(50, 50)

        val projects = arrayListOf(projectAlpha, projectBeta, projectGamma, projectKappa)

        val monthlyCostVisitor = MonthlyCostReportVisitor()
        val monthlyCost = projects.map { it.accept(monthlyCostVisitor) }.sum()
        println("monthly cost: $monthlyCost")
        assertThat(monthlyCost).isEqualTo(5333)

        val yearlyCostVisitor = YearlyCostReportVisitor()
        val yearlyCost = projects.map { it.accept(yearlyCostVisitor) }.sum()
        println("yearly cost: $yearlyCost")
        assertThat(yearlyCost).isEqualTo(20000)
    }
}