package marketplaceapi.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marketplaceapi.models.Item;
import marketplaceapi.repositories.Itemrepository;

@Service
public class ItemService {

    @Autowired
    private Itemrepository itemrepository;

    public Item getAdminById(Long id) {
        return itemrepository.findById(id).get();
    }
    
}
