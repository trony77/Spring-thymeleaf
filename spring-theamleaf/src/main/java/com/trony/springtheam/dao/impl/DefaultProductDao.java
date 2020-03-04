package com.trony.springtheam.dao.impl;

import com.trony.springtheam.dao.ProductDao;
import com.trony.springtheam.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DefaultProductDao implements ProductDao {

    private static final Map<String, Product> productMap = new HashMap<>();

    static {
        initProducts();
    }

    private static void initProducts() {
        Product product1 = new Product("REF001", "Prestation", "Prestation", 999.99);
        Product product2 = new Product("REF002", "Conference", "Conference", 1100.955);
        Product product3 = new Product("REF003", "Coatching&Service", "Coatching et Service", 1999.99);

        productMap.put(product1.getId(), product1);
        productMap.put(product2.getId(), product2);
        productMap.put(product3.getId(), product3);
    }

    @Override
    public void save(Product product) {
        product.setDescription(product.getDescription());
        product.setId(product.getId());
        product.setName(product.getName());
        product.setPrice(product.getPrice());
    }

    /**
     * Obtenir le produit par son code produit ean
     *
     * @param ean son code produit
     * @return
     */
    @Override
    public Product getProductByEAN(String ean) {
        return productMap.get(ean);
    }

    /**
     * Obtenir le produit par son code produit ean
     *
     * @return product
     */

    /**
     * Obtenir le produit par defaut avec son code produit ean
     *
     * @param ean
     * @return
     */
 /*   @Override
    public Product getDefaultProduct(String ean) {
        return productMap.getOrDefault("",productMap.getOrDefault(ean));
    }*/

    /**
     * Ajouter un produit
     *
     * @param product le produit
     * @return le produit
     */
    @Override
    public Product addProduct(Product product) {
        productMap.put(product.getId(), product);
        return product;
    }

    /**
     * Mise à jour du produit
     *
     * @param product le produit
     * @return le produit
     */
    @Override
    public Product updateProduct(Product product) {
        productMap.put(product.getId(), product);
        return product;
    }

    /**
     * Supprimer le produit
     *
     * @param ean le code   produit
     */
    @Override
    public void deleteProduct(final String ean) {
        productMap.remove(ean);
    }

    /**
     * recupere la liste de produit
     *
     * @return la liste de produit
     */
    @Override
    public List<Product> getAllProducts() {
        Product product = new Product();
        product.setId(product.getId());
        product.setName(product.getName());
        product.setDescription(product.getDescription());
        product.setPrice(product.getPrice());
        List<Product> productList = new ArrayList<>();
        productList.add(product);
        return productList;
        //return productList.stream().filter(Objects::nonNull).collect(Collectors.collectingAndThen(Collectors.toList(), Collections::unmodifiableList));
    }
}
