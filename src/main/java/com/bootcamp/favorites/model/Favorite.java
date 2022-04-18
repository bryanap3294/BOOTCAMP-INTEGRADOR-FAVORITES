package com.bootcamp.favorites.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document(value="channels")
public class Favorite {

    private String id;
    private String dni;
    private String name;
    private String serviceCode;

}
