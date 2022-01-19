package marketplaceapi.DTOS;

import lombok.Getter;
import lombok.Setter;
import marketplaceapi.models.Item;

@Setter 
@Getter 
public class ItemDTO {

    private String brand;
    private String title;
    private String description;

    public ItemDTO(Item item) {
        this.brand = item.getBrand();
        this.title = item.getTitle();
        this.description = item.getDescription();
    }

    public ItemDTO() {}
    
}
