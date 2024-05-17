package info.maxbehr.designpatternskotlin.behavioural.chainofresponsibility

import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class ChainOfResponsibilityTest {

    @Test
    fun testChainOfResponsibility() {
        val authenticationHeader = AuthenticationHeader("123456")
        val contentTypeHeader = ContentTypeHeader("application/json")
        val bodyPayloadHeader = BodyPayloadHeader("body: {\"username\" = \"john\"}")
        authenticationHeader.next = contentTypeHeader
        contentTypeHeader.next = bodyPayloadHeader

        val messageWithAuthentication = authenticationHeader.addHeader("Headers with authentication")
        println(messageWithAuthentication)

        println("------------------------")

        val messageWithoutAuthentication = contentTypeHeader.addHeader("Headers without authentication")
        println(messageWithoutAuthentication)

        assertThat(messageWithAuthentication).isEqualTo(
            """
                Headers with authentication
                Authorization: 123456
                ContentType: application/json
                body: {"username" = "john"}
            """.trimIndent()
        )

        assertThat(messageWithoutAuthentication).isEqualTo(
            """
                Headers without authentication
                ContentType: application/json
                body: {"username" = "john"}
            """.trimIndent()
        )
    }
}