package com.bootcamp.favorites.controller;

import com.bootcamp.favorites.model.Favorite;
import com.bootcamp.favorites.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/favorites")
public class FavoriteController {

    @Autowired
    private FavoriteService favoriteService;

    @GetMapping("/")
    public Flux<Favorite> findAll(){
        return favoriteService.findAll();
    }

    @PostMapping("/")
    public Mono<Favorite> save(@RequestBody Favorite favorite){
        return favoriteService.save(favorite);
    }

}
