package ir.iaut.reservationsystem

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class ReservationSystemApplication

fun main(args: Array<String>) {
    runApplication<ReservationSystemApplication>(*args)
}
