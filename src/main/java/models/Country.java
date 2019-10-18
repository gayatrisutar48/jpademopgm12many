package models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "country")
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true)
    private String name;

    @NotNull
    private String capital;

    @NotNull
    private String currency;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "country")
    private Set<State> statt = new HashSet<>();

    public Country() {

    }

    public Country(String name, String capital, String currency) {
        this.name = name;
        this.capital = capital;
        this.currency = currency;
    }

    public Collection<State> getState() {
        return null;
    }
}

// Getters and Setters use