package com.aca.homework.week16.organization;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", unique = true, nullable = false, length = 160)
    private String name;

    @Column(name = "address", nullable = false)
    private String fullAddress;

    public Organization(String name, String fullAddress) {
        this.name = name;
        this.fullAddress = fullAddress;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(fullAddress, that.fullAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fullAddress);
    }
}
