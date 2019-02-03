package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.Objects;

public final class ForumUser {

    private final int identifier;
    private final String name;
    private final char sex;
    private final LocalDate dateOfBirth;
    private final int quantityOfPublishedPosts;

    public ForumUser(final int identifier, final String name, final char sex, final LocalDate dateOfBirth, final int quantityOfPublishedPosts) {
        this.identifier = identifier;
        this.name = name;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.quantityOfPublishedPosts = quantityOfPublishedPosts;
    }

    public int getIdentifier() {
        return identifier;
    }

    public String getName() {
        return name;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getQuantityOfPublishedPosts() {
        return quantityOfPublishedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "identifier=" + identifier +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", quantityOfPublishedPosts=" + quantityOfPublishedPosts +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ForumUser forumUser = (ForumUser) o;
        return getIdentifier() == forumUser.getIdentifier() &&
                getSex() == forumUser.getSex() &&
                getQuantityOfPublishedPosts() == forumUser.getQuantityOfPublishedPosts() &&
                getName().equals(forumUser.getName()) &&
                getDateOfBirth().equals(forumUser.getDateOfBirth());
    }

    @Override
    public int hashCode() {
        return identifier;
    }
}
