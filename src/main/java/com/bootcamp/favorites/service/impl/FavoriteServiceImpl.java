package com.bootcamp.favorites.service.impl;

import com.bootcamp.favorites.model.Favorite;
import com.bootcamp.favorites.repository.FavoriteRepository;
import com.bootcamp.favorites.service.FavoriteService;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class FavoriteServiceImpl implements FavoriteService {

    @Autowired
    private FavoriteRepository favoriteRepository;

    @Override
    public Mono<Favorite> save(Favorite favorite) {
        return favoriteRepository.save(favorite);
    }

    @Override
    public Flux<Favorite> findAll() {
        return favoriteRepository.findAll();
    }
}
