package com.android.intents;

import java.io.Serializable;

/**
 * Created by kamalshree on 9/3/2018.
 */

public class Person implements Serializable {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
