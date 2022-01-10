package marketplaceapi.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import marketplaceapi.models.Item;
import marketplaceapi.services.ItemService;

@RestController
@RequestMapping("/itens")
public class ItemController {


    @Autowired
    private ItemService itemService;

    @GetMapping("/{id}")
    public ResponseEntity<Item> getAdminById(@PathVariable Long id ) {
        return ResponseEntity.ok(itemService.getAdminById(id));

        // return "CHAMOU";
    }


    
}
