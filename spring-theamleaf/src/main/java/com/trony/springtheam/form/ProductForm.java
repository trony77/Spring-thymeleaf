package com.trony.springtheam.form;

/**
 * La classe  ProductForm représentent des données de  formulaire
 * lorsqu'on créé un nouveau  Produit sur la page  addProduct.
 */
public class ProductForm {
    private String name;
    private String description;
    private Double price;
    private String EAN;

    public String getEAN() {
        return EAN;
    }

    public void setEAN(String EAN) {
        this.EAN = EAN;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}
