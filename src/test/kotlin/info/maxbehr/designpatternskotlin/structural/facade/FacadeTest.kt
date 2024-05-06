package info.maxbehr.designpatternskotlin.structural.facade

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class FacadeTest {

    @Test
    fun testFacade() {
        val userRepo = UserFacade()
        val user = User("John")
        userRepo.save(user)
        val retrievedUser = userRepo.findFirst()

        assertThat(retrievedUser.login).isEqualTo("John")
    }
}