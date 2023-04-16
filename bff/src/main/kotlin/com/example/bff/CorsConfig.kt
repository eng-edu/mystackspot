package com.example.bff

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
open class CorsConfig : WebMvcConfigurer {

    override fun addCorsMappings(registry: CorsRegistry) {
        registry.addMapping("/**")
            .allowedOrigins("mywebsite.com")
            .allowedMethods("GET,PUT,POST")
            .allowedHeaders("Cache-Control")
            .exposedHeaders(*(arrayOf("localhost")))
    }
}