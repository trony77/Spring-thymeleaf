package com.trony.springtheam.dao;

import com.trony.springtheam.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Component
public interface ProductDao {

    void save(Product product);

    /**
     * Obtenir le produit par son code produit ean
     *
     * @param ean son code produit
     * @return
     */
    Product getProductByEAN(final String ean);

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
    Product addProduct(final Product product);

    /**
     * Mise à jour du produit
     *
     * @param product le produit
     * @return le produit
     */
    Product updateProduct(final Product product);

    /**
     * Supprimer le produit
     *
     * @param ean le code produit
     */
    void deleteProduct(final String ean);


    /**
     * recupere la liste de produit
     *
     * @return la liste de produit
     */
    List<Product> getAllProducts();


}
