package com.example.antlerros95.journeyl;

/**
 * Created by antlerros95 on 19/03/2018.
 */

public class Milestone extends Item {

    private String mDescription;

    // TODO: Should be a series of values
    private float ratings;


    public Milestone(String name) {
        super(name);
    }

    public Milestone(String name, String description) {
        super(name);
        this.mDescription = description;
    }

}
