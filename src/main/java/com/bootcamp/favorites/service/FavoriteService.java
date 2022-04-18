package com.bootcamp.favorites.service;

import com.bootcamp.favorites.model.Favorite;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface FavoriteService {

    Mono<Favorite> save(Favorite favorite);
    Flux<Favorite> findAll();

}
