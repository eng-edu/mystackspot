package com.example.bff.controller

import br.com.zup.beagle.widget.layout.ScreenBuilder
import com.example.bff.service.MyService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class MyController(private val myService: MyService) {
    @GetMapping("/screen")
    fun getScreen() = myService.getMyScreen().build()
}