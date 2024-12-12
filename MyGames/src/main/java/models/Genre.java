package models;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "genres")
public class Genre {

    @Id
    @Column(name = "genre_id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "slug", nullable = false, unique = true)
    private String slug;

    @ManyToMany(mappedBy = "genres")
    private List<Game> games;

    // Getters and setters
}	