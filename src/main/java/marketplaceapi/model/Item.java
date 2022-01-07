package marketplaceapi.model;


import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "ITEMS")
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


    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "price_id", referencedColumnName = "id")
    // private Price price;


    // @OneToOne(cascade = CascadeType.ALL)
    // @JoinColumn(name = "dimension_id", referencedColumnName = "id")
    // private Dimension dimension;

    private Double weight;
    private Boolean active;



}
