package br.com.apikotlin.carteira.configuration

import org.flywaydb.core.Flyway
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FlywayConfig {


    @Bean(initMethod = "migrate")
    fun flyway(@Value("\${spring.flyway.url}") url: String,
               @Value("\${spring.flyway.user}") username: String,
               @Value("\${spring.flyway.password}") password: String,
               @Value("\${spring.flyway.schema}") schema: String): Flyway {

        val toolFlyway: Flyway = Flyway(Flyway.configure().schemas(schema).dataSource(url,username, password))
        toolFlyway.clean()
        return toolFlyway
    }







}