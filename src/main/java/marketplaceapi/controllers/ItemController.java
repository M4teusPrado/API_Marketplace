package marketplaceapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import marketplaceapi.DTOS.ItemDTO;
import marketplaceapi.models.Item;
import marketplaceapi.services.ItemService;

@RestController
@RequestMapping("/itens")
public class ItemController {
    
    @Autowired
    private ItemService itemService;

    @GetMapping()
    public ResponseEntity<List<Item>> getItens() {
        return ResponseEntity.ok(itemService.getItens());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Item> getItensById(@PathVariable Long id ){
        return ResponseEntity.ok(itemService.getItemById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteItem(@PathVariable Long id ) {
        itemService.deleteItem(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Item> updateItem(@PathVariable Long id, @RequestBody ItemDTO itemDTO) {
        itemService.updateItem(id, itemDTO);
        return null;
    }    
}
