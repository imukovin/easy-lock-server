package server.lock.easy.imukstudio.com

import io.ktor.client.request.get
import io.ktor.client.utils.EmptyContent.status
import io.ktor.http.HttpStatusCode
import io.ktor.server.testing.testApplication
import junit.framework.TestCase.assertEquals
import org.junit.Test
import server.lock.easy.imukstudio.com.plugins.configureRouting

class ApplicationTest {
    @Test
    fun testRoot() = testApplication {
        application {
            configureRouting()
        }
        client.get("/").apply {
            assertEquals(HttpStatusCode.OK, status)
            assertEquals("Hello World!", "Hello World!")
        }
    }
}
