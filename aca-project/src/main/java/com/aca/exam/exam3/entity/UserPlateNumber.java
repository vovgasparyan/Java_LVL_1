package com.aca.exam.exam3.entity;

import javax.persistence.*;

@Entity
@Table(name = "plates")
public class UserPlateNumber {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numbers", unique = true, nullable = false, length = 6)
    private String number;

    @Column(name = "numberstatus", nullable = false)
    private String numberStatus;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    public UserPlateNumber(String number, String numberStatus, User user) {
        this.number = number;
        this.numberStatus = numberStatus;
        this.user = user;
    }

    public Long getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getNumberStatus() {
        return numberStatus;
    }

    public void setNumberStatus(String numberStatus) {
        this.numberStatus = numberStatus;
    }
}
