package be.contribute.spring.course.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "breweries")
public class Brewery {
    @Id
    @SequenceGenerator(
            name = "brewery_sequence",
            sequenceName = "brewery_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "brewery_sequence"
    )
    @Column(name = "brewery_id")
    private Long id;
    private String name;
    private String street;
    private String streetNumber;
    private String postalCode;
    private String city;
    @OneToMany(mappedBy="breweries")
    private Set<Beer> beers;

    //Constructors
    public Brewery() {
    }

    public Brewery(String name, String street, String streetNumber, String postalCode, String city) {
        this.name = name;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public Brewery(Long id, String name, String street, String streetNumber, String postalCode, String city) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.streetNumber = streetNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    //Getters en setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Set<Beer> getBeers() {
        return beers;
    }

    public void setBeers(Set<Beer> beers) {
        this.beers = beers;
    }
}
