package it.unitn.disi.callaioli.stefano.beans;

import java.io.Serializable;

/**
 *
 * @author StefanoCallaioli
 */

public class ProductBean implements Serializable{
    private String name;
    private String price;
    private String description;
    private String category;

    public ProductBean() {
    }

    public ProductBean(String name, String price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
    }
    
    public ProductBean(ProductBean product) {
        this.name = product.name;
        this.price = product.price;
        this.description = product.description;
        this.category = product.category;         
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
