package br.com.apikotlin.carteira.services

import br.com.apikotlin.carteira.entities.Cartao
import br.com.apikotlin.carteira.repository.CartaoRespository
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono

@Service
class CartaoService(
     private val repository: CartaoRespository
) {



    fun buscarPorId(id: Int): Mono<Cartao> = repository.findById(id)

    fun salvarCartao(cartao: Cartao): Mono<Cartao> = repository.save(cartao)

    fun deletarCartao(id: Int): Mono<Void> = repository.deleteById(id)

    fun atualizarCartao(id: Int, cartao: Cartao): Mono<Cartao> {
        return repository.findById(id)
            .map {
                it
                    .copy(
                        id = id,
                        bin = cartao.bin,
                        validade = cartao.validade,
                        cvv = cartao.cvv,
                        tipo = cartao.tipo
                    )
            }
    }


}