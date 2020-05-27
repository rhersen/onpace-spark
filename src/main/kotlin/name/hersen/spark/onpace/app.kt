package name.hersen.spark.onpace

import spark.kotlin.Http
import spark.kotlin.ignite
import spark.kotlin.port

fun main(args: Array<String>) {
    port(System.getenv("PORT")?.toInt() ?: 4567)
    val http: Http = ignite()

    http.get("/hello") {
        "Hello Spark Kotlin!"
    }
}
