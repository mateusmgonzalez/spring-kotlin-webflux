package br.com.apikotlin.carteira.entities

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table("cartao")
data class Cartao(
    @Id val id: Int,
    val bin: String,
    val validade: String,
    val cvv: String,
    val tipo: String
)
