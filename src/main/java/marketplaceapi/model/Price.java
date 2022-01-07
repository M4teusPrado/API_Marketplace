package marketplaceapi.model;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "price")
public class Price implements Serializable {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) 
    private Long id;
    private Double defaultVar;
    private Double sale;


}
