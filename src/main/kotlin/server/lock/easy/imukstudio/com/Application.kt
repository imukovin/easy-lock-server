package server.lock.easy.imukstudio.com

import io.ktor.server.application.Application
import io.ktor.server.engine.embeddedServer
import io.ktor.server.netty.Netty
import server.lock.easy.imukstudio.com.plugins.configureRouting
import server.lock.easy.imukstudio.com.plugins.configureSockets

fun main() {
    embeddedServer(Netty, port = 8080, host = "0.0.0.0", module = Application::module)
        .start(wait = true)
}

fun Application.module() {
    configureSockets()
    configureRouting()
}
