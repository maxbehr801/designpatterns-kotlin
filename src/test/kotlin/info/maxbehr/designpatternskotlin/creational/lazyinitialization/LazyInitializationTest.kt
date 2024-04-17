package info.maxbehr.designpatternskotlin.creational.lazyinitialization

import kotlin.test.Test
import kotlin.test.assertNotNull

class LazyInitializationTest {

    @Test
    fun lazyInitializationTestLateInit() {
        val lazyInitializationLateInit = LazyInitializationLateInit()
        lazyInitializationLateInit.showMessage("Hello with late init")
        assertNotNull(lazyInitializationLateInit.box)
    }

    @Test
    fun lazyInitializationTestLazy() {
        val lazyInitializationByLazy = LazyInitializationByLazy()
        lazyInitializationByLazy.showMessage("Hello with lazy")
        assertNotNull(lazyInitializationByLazy.box)
    }
}