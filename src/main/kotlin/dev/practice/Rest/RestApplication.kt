package dev.practice.Rest

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication
import org.springframework.boot.web.servlet.ServletComponentScan
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.ComponentScans
import org.springframework.data.jpa.repository.config.EnableJpaRepositories

@SpringBootApplication
@ComponentScan(basePackages = arrayOf("dev.practice.*"))
@EntityScan(basePackages = arrayOf("dev.practice.entity"))
@EnableJpaRepositories(basePackages = arrayOf("dev.practice.repo"))
class RestApplication

fun main(args: Array<String>) {
	runApplication<RestApplication>(*args)
}
