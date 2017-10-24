package com.example.alin_.lectures;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by alin- on 18.10.2017.
 */

public class User extends BaseObservable {
    private String firstName;
    private String lastName;
    private String photoUrl;
    private boolean isOnline;

    public User() {
    }

    public User(String firstName, String lastName, String photoUrl, boolean isOnline) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.photoUrl = photoUrl;
        this.isOnline = isOnline;
    }

    public boolean isOnline() {
        return isOnline;
    }

    public void setOnline(boolean online) {
        isOnline = online;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    @Bindable
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
        notifyPropertyChanged(BR.firstName);
    }

    @Bindable
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
        notifyPropertyChanged(BR.lastName);
    }
}
