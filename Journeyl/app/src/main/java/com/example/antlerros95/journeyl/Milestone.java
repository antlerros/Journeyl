package com.example.antlerros95.journeyl;

/**
 * Created by antlerros95 on 19/03/2018.
 */

public class Milestone extends Item {

    private String mDescription;
    private int mID;

    // TODO: Should be a series of values?
    private float ratings;
    private String mReflection;


    public Milestone(String name) {
        super(name);
    }

    public Milestone(String name, String description, int mID) {
        super(name);
        this.mDescription = description;
        this.mID = mID;
    }

    public int getID() { return mID; }

    public void setID(int ID) {
        this.mID = ID;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setReflection(String reflection) {
        this.mReflection = reflection;
    }
}
