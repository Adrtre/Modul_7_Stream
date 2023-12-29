package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public class ForumUser {
    private int userId;
    private String username;
    private char gender;

    private LocalDate birthdate;
    private int postsCount;

    public ForumUser(int userId, String username, char gender, LocalDate birthdate, int postsCount) {
        this.userId = userId;
        this.username = username;
        this.gender = gender;
        this.birthdate = birthdate;
        this.postsCount = postsCount;
    }
    public int getUserId() {

        return userId;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public char getGender() {

        return gender;
    }

    public int getPostsCount() {

        return postsCount;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", gender=" + gender +
                ", birthdate=" + birthdate +
                ", postsCount=" + postsCount +
                '}';
    }
}