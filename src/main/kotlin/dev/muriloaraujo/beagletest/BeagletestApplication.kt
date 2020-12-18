package dev.muriloaraujo.beagletest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BeagletestApplication

fun main(args: Array<String>) {
	runApplication<BeagletestApplication>(*args)
}
