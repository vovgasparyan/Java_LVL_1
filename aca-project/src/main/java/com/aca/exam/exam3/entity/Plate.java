package com.aca.exam.exam3.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "plates")
public class Plate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "numbers", unique = true, nullable = false)
    private String numbers;

    @Column(name = "number_status", nullable = false)
    private String numberStatus = "free";

    public Plate(String numbers, String numberStatus) {
        this.numbers = numbers;
        this.numberStatus = numberStatus;
    }
    public Plate() {

    }

    public Long getId() {
        return id;
    }

    public String getNumbers() {
        return numbers;
    }

    public String getNumberStatus() {
        return numberStatus;
    }

    @Override
    public String toString() {
        return "Plate{" +
                "id=" + id +
                ", numbers='" + numbers + '\'' +
                ", numberStatus='" + numberStatus + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plate plate = (Plate) o;
        return Objects.equals(id, plate.id) && Objects.equals(numbers, plate.numbers) && Objects.equals(numberStatus, plate.numberStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, numbers, numberStatus);
    }
}
