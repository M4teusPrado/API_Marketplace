package marketplaceapi.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class Item implements Serializable {

    
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) 
    private Long id;
    
    private String brand;
    private String title;
    private String description;
    private String category;
    // private Array image 
    // private Array videos
    private String ean;
    private int availableQuantity;


    // @OneToOne()
    private Price price;

    // @OneToOne()
    private Dimension dimension;

    private Double weight;
    private Boolean active;



}
