package br.com.apikotlin.carteira.repository

import br.com.apikotlin.carteira.entities.Cartao
import org.springframework.data.repository.reactive.ReactiveCrudRepository


interface CartaoRespository: ReactiveCrudRepository<Cartao, Int> {

}