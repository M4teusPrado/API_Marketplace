package marketplaceapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import marketplaceapi.models.Item;

@Repository
public interface Itemrepository  extends JpaRepository<Item, Long>{
    
    //
}
