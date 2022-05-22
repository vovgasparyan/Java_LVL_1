package com.aca.homework.week19.job.platform.entity.userorganization;

import com.aca.homework.week19.job.platform.entity.organization.Organization;
import com.aca.homework.week19.job.platform.entity.user.User;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "user_organization")
public class UserOrganization {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ORGANIZATION_ID_SEQUENCE")
    @SequenceGenerator(name = "USER_ORGANIZATION_ID_SEQUENCE")
    private Long id;

    @OneToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "FK_USER_ORGANIZATION_USER_ID"), nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "organization_id", foreignKey = @ForeignKey(name = "FK_USER_ORGANIZATION_ORGANIZATION_ID"), nullable = false)
    private Organization organization;

    public UserOrganization(User user, Organization organization) {
        this.user = user;
        this.organization = organization;
    }

    public UserOrganization() {}

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Organization getOrganization() {
        return organization;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserOrganization that = (UserOrganization) o;
        return Objects.equals(id, that.id) && Objects.equals(user, that.user) && Objects.equals(organization, that.organization);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, organization);
    }

    @Override
    public String toString() {
        return "UserOrganization{" +
                "id=" + id +
                ", user=" + user +
                ", organization=" + organization +
                '}';
    }
}
