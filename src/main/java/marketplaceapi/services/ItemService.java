package marketplaceapi.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import marketplaceapi.models.Item;
import marketplaceapi.repositories.Itemrepository;

@Service
public class ItemService {

    @Autowired
    private Itemrepository itemrepository;

    public List<Item> getItens() {
        return itemrepository.findAll();
    }

   
    public Item getItemById(Long id) {
        try {
            return itemrepository.findById(id).get();
        } catch (Exception e) {
            throw new ResponseStatusException( HttpStatus.NOT_FOUND, "Item não encontrado");
        }
    }

    public void deleteItem(Long id) {
        itemrepository.delete(getItemById(id));
    }
}
