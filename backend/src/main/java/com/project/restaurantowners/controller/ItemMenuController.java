package com.project.restaurantowners.controller;
import com.project.restaurantowners.model.ItemMenu;
import com.project.restaurantowners.service.ItemMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/item-menu")
public class ItemMenuController {

    @Autowired
    private ItemMenuService itemMenuService;

    @GetMapping("/{id}")
    public ItemMenu getItemMenuById(@PathVariable Long id) {
        return itemMenuService.getItemMenuById(id);
    }

    @GetMapping("/all")
    public List<ItemMenu> getAllItemMenus() {
        return itemMenuService.getAllItemMenus();
    }

    @PostMapping("/create")
    public ItemMenu createItemMenu(@RequestBody ItemMenu itemMenu) {
        return itemMenuService.createItemMenu(itemMenu);
    }

    @PutMapping("/update/{id}")
    public ItemMenu updateItemMenu(@PathVariable Long id, @RequestBody ItemMenu itemMenu) {
        return itemMenuService.updateItemMenu(id, itemMenu);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteItemMenu(@PathVariable Long id) {
        itemMenuService.deleteItemMenu(id);
    }
}
