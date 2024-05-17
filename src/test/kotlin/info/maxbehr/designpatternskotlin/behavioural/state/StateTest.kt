package info.maxbehr.designpatternskotlin.behavioural.state

import assertk.assertThat
import assertk.assertions.isEqualTo
import assertk.assertions.isFalse
import assertk.assertions.isTrue
import kotlin.test.Test

class StateTest {

    @Test
    fun testState() {
        val authorizationPresenter = AuthorizationPresenter()
        authorizationPresenter.loginUser("admin")
        println(authorizationPresenter)
        assertThat(authorizationPresenter.isAuthorized).isTrue()
        assertThat(authorizationPresenter.username).isEqualTo("admin")

        authorizationPresenter.logoutUser()
        println(authorizationPresenter)
        assertThat(authorizationPresenter.isAuthorized).isFalse()
        assertThat(authorizationPresenter.username).isEqualTo("Unknown")
    }
}