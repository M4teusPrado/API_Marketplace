package marketplaceapi.model;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Price implements Serializable {


    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY) 
    private Long id;


    private Double defaultVar;
    private Double sale;
}
