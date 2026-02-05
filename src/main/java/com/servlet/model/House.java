package com.servlet.model;

import jakarta.persistence.*;


@Entity
@Table(name="houses")
public class House {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String address;
    private int rooms;


    public Long getId() { return id; }
    public String getAddress() { return address; }
    public void setAddress(String address) { this.address = address; }


    public int getRooms() { return rooms; }
    public void setRooms(int rooms) { this.rooms = rooms; }
}