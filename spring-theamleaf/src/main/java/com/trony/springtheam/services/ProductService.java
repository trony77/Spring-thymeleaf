package com.trony.springtheam.services;

import com.trony.springtheam.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {
    /**
     * Obtenir le produit par son code produit ean
     *
     * @param ean son code produit
     * @return
     */
    Product getProductById(int ean);

    /**
     * Obtenir le produit par  defaut avec son code produit ean
     * @param ean
     * @return
     */
    // public Product getDefaultProduct(final String ean);

    /**
     * Ajouter un produit
     *
     * @param product le produit
     * @return le produit
     */
    Product addProduct(Product product);

    /**
     * Mise à jour du produit
     *
     * @param product le produit
     * @return le produit
     */
    Product updateProduct(Product product);

    /**
     * Supprimer le produit
     *
     * @param id le code produit
     */
    void deleteProduct(int id);

    /**
     * recupere la liste de produit
     *
     * @return la liste de produit
     */
    List<Product> getAllProducts();

    void save(Product product);


}
