package com.example.Spring.Gateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class FallbackController {

    @RequestMapping("/peliculaFallBack")
    public Mono<String> PeliculaFallBackService(){
        return Mono.just("Pelicula Service esta tardando en responder, intentelo mas tarde!!!!");
    }
}
