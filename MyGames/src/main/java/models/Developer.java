package models;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name = "developers")
public class Developer {

    @Id
    @Column(name = "developer_id")
    private Integer id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "slug", nullable = false, unique = true)
    private String slug;

    @ManyToMany(mappedBy = "developers")
    private List<Game> games;

    // Getters and setters
}