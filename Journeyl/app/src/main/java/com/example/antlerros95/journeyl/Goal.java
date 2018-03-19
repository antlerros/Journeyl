package com.example.antlerros95.journeyl;

/**
 * Created by antlerros95 on 19/03/2018.
 */

public class Goal extends Item {

    private String mDescription;

    public Goal(String name) {
        super(name);
    }

    public Goal(String name, String description) {
        super(name);
        this.mDescription = description;
    }

    public String getDescription(){
        return mDescription;
    }

    public void setDescription(String description) {
        mDescription = description;
    }

}
