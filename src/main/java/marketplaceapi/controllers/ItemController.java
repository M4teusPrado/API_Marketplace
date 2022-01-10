package marketplaceapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
