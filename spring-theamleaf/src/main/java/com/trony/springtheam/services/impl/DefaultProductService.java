package com.trony.springtheam.services.impl;

import com.trony.springtheam.dao.ProductDao;
import com.trony.springtheam.model.Product;
import com.trony.springtheam.services.ProductService;

import java.util.List;

public class DefaultProductService implements ProductService {
    private ProductDao dao;


    /**
     * Obtenir le produit par son code produit ean
     *
     * @param ean son code produit
     * @return
     */
    @Override
    public Product getProductById(int ean) {
        return null;
    }

    /**
     * Ajouter un produit
     *
     * @param product le produit
     * @return le produit
     */
    @Override
    public Product addProduct(Product product) {
        return null;
    }

    /**
     * Mise à jour du produit
     *
     * @param product le produit
     * @return le produit
     */
    @Override
    public Product updateProduct(Product product) {
        return null;
    }

    /**
     * Supprimer le produit
     *
     * @param id le code produit
     */
    @Override
    public void deleteProduct(int id) {

    }

    /**
     * recupere la liste de produit
     *
     * @return la liste de produit
     */
    @Override
    public List<Product> getAllProducts() {
        return dao.getAllProducts();
    }

    @Override
    public void save(Product product) {

    }


    public void setDao(ProductDao dao) {
        this.dao = dao;
    }
}
