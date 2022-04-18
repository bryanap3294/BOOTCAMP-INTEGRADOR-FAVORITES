package com.bootcamp.favorites.repository;

import com.bootcamp.favorites.model.Favorite;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteRepository extends ReactiveMongoRepository<Favorite, String> {
}
