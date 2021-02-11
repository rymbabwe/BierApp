package be.contribute.spring.course.model;

import org.hibernate.annotations.Fetch;

import javax.persistence.*;

@Entity
@Table(name = "beers")
public class Beer {
    @Id
    @SequenceGenerator(
            name = "beer_sequence",
            sequenceName = "beer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "beer_sequence"
    )
    @Column(name = "id")
    private Long id;
    private String name;
    private String beerType;
    private Double percentage;
    private String description;
    private String country;
    private String fermentation;
    private String grainType;
    //@OneToOne(fetch=FetchType.LAZY)
    //@OneToOne(cascade= CascadeType.ALL)
    //@JoinColumn(name="brewery_id")

    //private Brewery brewery;

    //Constructors
    public Beer() {
    }

    public Beer(String name, String beerType, Double percentage, String description, String country, String fermentation, String grainType) {
        this.name = name;
        this.beerType = beerType;
        this.percentage = percentage;
        this.description = description;
        this.country = country;
        this.fermentation = fermentation;
        this.grainType = grainType;
    }

    public Beer(Long id, String name, String beerType, Double percentage, String description, String country, String fermentation, String grainType) {
        this.id = id;
        this.name = name;
        this.beerType = beerType;
        this.percentage = percentage;
        this.description = description;
        this.country = country;
        this.fermentation = fermentation;
        this.grainType = grainType;
        //this.brewery = brewery;
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

    public String getBeerType() {
        return beerType;
    }

    public void setBeerType(String beerType) {
        this.beerType = beerType;
    }

    public Double getPercentage() {
        return percentage;
    }

    public void setPercentage(Double percentage) {
        this.percentage = percentage;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFermentation() {
        return fermentation;
    }

    public void setFermentation(String fermentation) {
        this.fermentation = fermentation;
    }

    public String getGrainType() {
        return grainType;
    }

    public void setGrainType(String grainType) {
        this.grainType = grainType;
    }

    /*public Brewery getBrewery() {
        return brewery;
    }

    public void setBrewery(Brewery brewery) {
        this.brewery = brewery;
    }*/


}
