package be.contribute.spring.course.model;

import javax.persistence.*;

@Entity
@Table
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
    @Column(name="brewery_id")
    private int id;
    private String name;
    private String street;
    private String number;
    private String postalCode;
    private String city;

    //Constructors
    public Brewery() {
    }

    public Brewery(String name, String street, String number, String postalCode, String city) {
        this.name = name;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    public Brewery(int id, String name, String street, String number, String postalCode, String city) {
        this.id = id;
        this.name = name;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    //Getters en setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    //toString()

    @Override
    public String toString() {
        return "Brewery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", number='" + number + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
