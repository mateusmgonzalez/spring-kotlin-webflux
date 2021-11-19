package br.com.apikotlin.carteira.controller

import br.com.apikotlin.carteira.entities.Cartao
import br.com.apikotlin.carteira.services.CartaoService
import org.springframework.web.bind.annotation.*
import reactor.core.publisher.Mono

@RestController
@RequestMapping("/carteira")
class CartaoController(val cartaoService: CartaoService) {

    @PostMapping
    fun cadastra(@RequestBody cartao: Cartao) : Mono<Cartao> = Mono.just(cartao).flatMap { cartaoService.salvarCartao(cartao) }


    @GetMapping(value= ["/{id}"])
    fun buscarPorId(@PathVariable id: Int) : Mono<Cartao> = cartaoService.buscarPorId(id)


    @DeleteMapping(value = ["/{id}"])
    fun deletar(@PathVariable id: Int) : Mono<Void> =  cartaoService.deletarCartao(id)


    @PutMapping(value = ["/{id}"])
    fun atualizar(@PathVariable id: Int, @RequestBody cartao: Cartao) : Mono<Cartao> = Mono.just(cartao).flatMap { cartaoService.atualizarCartao(id, cartao) }

}