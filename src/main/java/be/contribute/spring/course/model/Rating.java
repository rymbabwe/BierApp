package be.contribute.spring.course.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table
@IdClass(RatingId.class)
public class Rating {
    @Id
    private Beer beer;
    @Id
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
