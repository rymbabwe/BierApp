package be.contribute.spring.course.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class RatingId implements Serializable {

    private Beer beer;
    private Amateur amateur;

    //Constructor
    public RatingId(Beer beer, Amateur amateur) {
        this.beer = beer;
        this.amateur = amateur;
    }
}
