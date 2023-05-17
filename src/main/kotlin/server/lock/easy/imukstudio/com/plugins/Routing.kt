package server.lock.easy.imukstudio.com.plugins

import io.ktor.server.routing.routing
import io.ktor.server.application.Application
import io.ktor.server.application.call
import io.ktor.server.request.receiveParameters
import io.ktor.server.response.respondText
import io.ktor.server.routing.get
import io.ktor.server.routing.post

fun Application.configureRouting() {
    routing {
        get("/") {
            call.respondText("Hello World!")
        }
        post("/image") {
            val parameters = call.receiveParameters()
            val image = parameters["image"].toString()

            call.respondText("Received: $image")
        }
    }
}
