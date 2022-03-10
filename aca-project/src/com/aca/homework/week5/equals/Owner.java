package com.aca.homework.week5.equals;

public class Owner {

    private String firstName;
    private String lastName;

    public Owner (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Owner {" + "firstName='" + firstName + ", lastName='" + lastName + '}';
    }

    @Override
    public boolean equals(Object obj) {
        Owner owner = (Owner) obj;

        if (obj == null || obj.getClass() != Owner.class) {
            return false;
        }

        return owner.firstName.equals(this.firstName) && owner.lastName.equals(this.lastName);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}
