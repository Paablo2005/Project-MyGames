package models;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "games")
public class Game {

    @Id
    @Column(name = "game_id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @OneToMany(mappedBy = "game", cascade = CascadeType.ALL)
    private List<GameImage> images;

    @ManyToMany
    @JoinTable(
        name = "game_platform",
        joinColumns = @JoinColumn(name = "game_id"),
        inverseJoinColumns = @JoinColumn(name = "platform_id")
    )
    private List<Platform> platforms;

    @ManyToMany
    @JoinTable(
        name = "game_genre",
        joinColumns = @JoinColumn(name = "game_id"),
        inverseJoinColumns = @JoinColumn(name = "genre_id")
    )
    private List<Genre> genres;

    @ManyToMany
    @JoinTable(
        name = "game_developer",
        joinColumns = @JoinColumn(name = "game_id"),
        inverseJoinColumns = @JoinColumn(name = "developer_id")
    )
    private List<Developer> developers;

    @ManyToMany(mappedBy = "games")
    private List<User> users;

    // Getters and setters
}