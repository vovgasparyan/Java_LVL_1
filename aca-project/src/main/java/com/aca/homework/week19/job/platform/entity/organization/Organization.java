package com.aca.homework.week19.job.platform.entity.organization;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "organizations")
public class Organization {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ORG_ID_SEQUENCE")
    @SequenceGenerator(name = "ORG_ID_SEQUENCE")
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "organization_details", nullable = false)
    private String organizationDetails;

    public Organization(String name, String organizationDetails) {
        this.name = name;
        this.organizationDetails = organizationDetails;
    }

    public Organization() {}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOrganizationDetails() {
        return organizationDetails;
    }

    public void setOrganizationDetails(String organizationDetails) {
        this.organizationDetails = organizationDetails;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(organizationDetails, that.organizationDetails);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, organizationDetails);
    }

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", organizationName='" + name + '\'' +
                ", organizationDetails='" + organizationDetails + '\'' +
                '}';
    }
}
