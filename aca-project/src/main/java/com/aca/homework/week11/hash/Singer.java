package com.aca.homework.week11.hash;

import java.util.Objects;

public class Singer {

    private final String firstName;
    private final String lastName;

    public Singer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Singer)) return false;

        Singer singer = (Singer) o;

        if (!Objects.equals(firstName, singer.firstName)) return false;
        return Objects.equals(lastName, singer.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
