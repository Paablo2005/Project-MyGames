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
    
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<GameImage> getImages() {
		return images;
	}

	public void setImages(List<GameImage> images) {
		this.images = images;
	}

	public List<Platform> getPlatforms() {
		return platforms;
	}

	public void setPlatforms(List<Platform> platforms) {
		this.platforms = platforms;
	}

	public List<Genre> getGenres() {
		return genres;
	}

	public void setGenres(List<Genre> genres) {
		this.genres = genres;
	}

	public List<Developer> getDevelopers() {
		return developers;
	}

	public void setDevelopers(List<Developer> developers) {
		this.developers = developers;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}    
    
}