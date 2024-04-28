package c322spring2024homework2.controllers;

import c322spring2024homework2.model.Builder;
import c322spring2024homework2.model.Guitar;
import c322spring2024homework2.model.Type;
import c322spring2024homework2.model.Wood;
import c322spring2024homework2.repository.InventoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/guitars")
public class InventoryController {
    private InventoryRepository inventoryRepository;

    public InventoryController(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    @GetMapping("/search")
    public List<Guitar> searchGuitars(@RequestParam(required = false) String serialNumber,
                                      @RequestParam(required = false) double price,
                                      @RequestParam(required = false) Builder builder,
                                      @RequestParam(required = false) String model,
                                      @RequestParam(required = false) Type type,
                                      @RequestParam(required = false) Wood backWood ,
                                      @RequestParam(required = false) Wood topWood) {
        Guitar searchCriteria = new Guitar(serialNumber, price, builder, model, type, backWood, topWood);
        return inventoryRepository.search(searchCriteria);
    }

    @PostMapping("/add")
    public Guitar addGuitar(@RequestBody Guitar guitar) {
        return inventoryRepository.addGuitar(guitar);
    }

    @GetMapping("/find/{serialNumber}")
    public Guitar findGuitar(@PathVariable String serialNumber) {
        return inventoryRepository.getGuitar(serialNumber);
    }
}
