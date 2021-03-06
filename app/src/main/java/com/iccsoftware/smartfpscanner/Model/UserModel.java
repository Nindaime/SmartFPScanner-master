package com.iccsoftware.smartfpscanner.Model;

/**
 * Created by Scarecrow on 1/29/2019.
 */

public class UserModel {

    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String image;
    private String imageThumb;

    public UserModel() {
    }

    public UserModel(String username, String firstName, String lastName, String password, String image, String imageThumb) {
        this.username = username;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.image = image;
        this.imageThumb = imageThumb;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImageThumb() {
        return imageThumb;
    }

    public void setImageThumb(String imageThumb) {
        this.imageThumb = imageThumb;
    }
}
