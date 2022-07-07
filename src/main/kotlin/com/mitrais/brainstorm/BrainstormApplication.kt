package com.mitrais.brainstorm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BrainstormApplication

fun main(args: Array<String>) {
	runApplication<BrainstormApplication>(*args)
}
