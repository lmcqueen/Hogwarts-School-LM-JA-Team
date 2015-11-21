/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.hogwartsschool.model;

import java.io.Serializable; 
import java.util.Objects;
/**
 *
 * @author jagiriga 
 */
public class InventoryItem implements Serializable{
    
    public enum Items {
        wand,
        hornedSlug,
        porcupineQuills, 
        pungousOnions, 
        snakeFangs, 
        flobberwormMucus, 
        gingerRoot, 
        feather,
        goblet,
        cauldron,
        telescope
    }
    
    //class instance variables
    private String name;
    private String description;
    private String itemType;
    private int quantity;

    public InventoryItem() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.name);
        hash = 29 * hash + Objects.hashCode(this.description);
        hash = 29 * hash + Objects.hashCode(this.itemType);
        hash = 29 * hash + this.quantity;
        return hash;
    }

    @Override
    public String toString() {
        return "InventoryItem{" + "name=" + name + ", description=" + description + ", itemType=" + itemType + ", quantity=" + quantity + '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InventoryItem other = (InventoryItem) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (this.quantity != other.quantity) {
            return false;
        }
        return true;
    }

    
}

