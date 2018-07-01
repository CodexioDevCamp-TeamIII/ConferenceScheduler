package com.teamthree.conferencescheduler.entities;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="venue")
public class Venue {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     private Long id;

    public Venue() {
    }

    public Venue( String address, List<Hall> halls) {
        this.address = address;
        this.halls = halls;
    }

    @Column(name = "address")
    private String address;

    @Column(name ="halls")
    private List<Hall> halls;

    public void setAddress(String address) {
        this.address = address;
    }

    public void setHalls(List<Hall> halls) {
        this.halls = halls;
    }

    public List<Hall> getHalls() {
        return halls;
    }

    public Long getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }
}