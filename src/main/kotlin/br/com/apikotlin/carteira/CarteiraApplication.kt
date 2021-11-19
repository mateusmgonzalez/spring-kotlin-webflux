package br.com.apikotlin.carteira

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class CarteiraApplication

fun main(args: Array<String>) {
    runApplication<CarteiraApplication>(*args)
}
