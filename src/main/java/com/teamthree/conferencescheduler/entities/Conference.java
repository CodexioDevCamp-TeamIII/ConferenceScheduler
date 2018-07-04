package com.teamthree.conferencescheduler.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@Entity
@Table(name = "conferences")
public class Conference {
    @Transient
    private String start;

    @Transient
    private String end;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @ManyToOne()
    private Venue venue;
    @ManyToOne
    private User owner;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "end_date")
    private String endDate;
    @OneToMany(mappedBy = "conference")
    private List<Session> sessions;

    public Conference() {

    }

    //TODO REFACTOR VENue TO BE STRIng
    public Conference(String name, String description, Venue venue, String startDate, String endDate, User owner, List<Session> sessions) {
        this.name = name;
        this.description = description;
        this.venue = venue;
        this.startDate = startDate;
        this.endDate = endDate;
        this.owner = owner;
        this.sessions = sessions;
    }

    // FOR TESTING ONLY REMOVE LATER
    public Conference(String name, String description, String start, String end) {
        this.name = name;
        this.description = description;
        this.start = start;
        this.end = end;
    }

    public List<Session> getSessions() {
        return sessions;
    }

    public long getId() {
        return this.id;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartDate() {
        return this.startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return this.endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Venue getVenue() {
        return this.venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public User getOwner() {
        return this.owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public String getStart() {
        return this.start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return this.end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }
}
