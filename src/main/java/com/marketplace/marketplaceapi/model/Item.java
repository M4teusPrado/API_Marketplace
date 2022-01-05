package com.marketplace.marketplaceapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Item {

    @Id
    private int id;
    
    private String brand;
    private String title;
    private String description;
    private String category;
    // private Array image 
    // private Array videos
    private String ean;
    private int availableQuantity;
    private Price price;
    private Dimension dimension;
    private Double weight;
    private Boolean active;



}
