package com.example.wcd_t2009a_nguyenmanhnam.model;

import javax.persistence.*;

@Entity
@Table(name = "phone")

public class Phone {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String brand;
    private int price;
    private String description;

    public Phone(String name, String brand, Integer price, String description) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.description = description;
    }

    public Phone() {

    }

    @Id
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
