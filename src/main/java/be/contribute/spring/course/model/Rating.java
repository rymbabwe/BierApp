package be.contribute.spring.course.model;

import javax.persistence.*;

@Entity
@Table
@IdClass(RatingId.class)
public class Rating {
    @Id
    @SequenceGenerator(
            name = "rating_sequence",
            sequenceName = "rating_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "rating_sequence"
    )
    private int id;
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "BEER_ID")
    private Beer beer;

    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "AMATEUR_ID")
    private Amateur amateur;

    private boolean liked;

    //Constructors
    public Rating() {
    }

    public Rating(Beer beer, Amateur amateur, boolean liked) {
        this.beer = beer;
        this.amateur = amateur;
        this.liked = liked;
    }

    //Getters en setters
    public int getId() {
        return id;
    }

    public Beer getBeer() {
        return beer;
    }

    public void setBeer(Beer beer) {
        this.beer = beer;
    }

    public Amateur getAmateur() {
        return amateur;
    }

    public void setAmateur(Amateur amateur) {
        this.amateur = amateur;
    }

    public boolean isLiked() {
        return liked;
    }

    public void setLiked(boolean liked) {
        this.liked = liked;
    }

    //toString()
    @Override
    public String toString() {
        return "Rating{" +
                "beer=" + beer +
                ", amateur=" + amateur +
                ", like=" + liked +
                '}';
    }
}
