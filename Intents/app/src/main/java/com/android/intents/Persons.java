package com.android.intents;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by kamalshree on 9/3/2018.
 */

public class Persons implements Parcelable {

    private String firstName;
    private String lastName;

    private List<String> qualification;

    public Persons() {
        super();
    }

    protected Persons(Parcel in) {
        this.firstName = in.readString();
        this.lastName = in.readString();
        this.qualification=in.readArrayList(null);
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
        dest.writeList(this.qualification);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Persons> CREATOR = new Creator<Persons>() {
        @Override
        public Persons createFromParcel(Parcel in) {
            return new Persons(in);
        }

        @Override
        public Persons[] newArray(int size) {
            return new Persons[size];
        }
    };

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

    public List<String> getQualification() {
        return qualification;
    }

    public void setQualification(List<String> qualification) {
        this.qualification = qualification;
    }
}
