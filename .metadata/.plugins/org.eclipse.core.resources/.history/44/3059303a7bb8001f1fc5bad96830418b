package models;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "platforms")
public class Platform {

    @Id
    @Column(name = "platform_id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "slug", nullable = false, unique = true)
    private String slug;

    @ManyToMany(mappedBy = "platforms")
    private List<Game> games;

    @ManyToMany(mappedBy = "platforms")
    private List<User> users;

    // Getters and setters
}