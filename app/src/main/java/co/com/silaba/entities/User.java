package co.com.silaba.entities;

import java.util.Objects;

public class User {

    private String id;

    private String username;

    private String firstName;

    private String lastName;

    private String email;

    private String avatarUrl;

    User() {
        this.id = "";
        this.username = "";
        this.firstName = "";
        this.lastName = "";
        this.email = "";
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getDisplayName() {
        return (username == null || username.isEmpty()) ? firstName : username;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id);
    }

    //TODO: Falta implementar extension User: SnapshotParser de User.swift
}
