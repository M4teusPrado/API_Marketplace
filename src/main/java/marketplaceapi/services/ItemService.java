package marketplaceapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import marketplaceapi.models.Item;
import marketplaceapi.repositories.Itemrepository;

@Service
public class ItemService {

    @Autowired
    private Itemrepository itemrepository;

    public List<Item> getItens() {
        return itemrepository.findAll();
    }
    
}
