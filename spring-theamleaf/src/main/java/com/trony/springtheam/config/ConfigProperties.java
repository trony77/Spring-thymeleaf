package com.trony.springtheam.config;

import com.trony.springtheam.model.Site;
import com.trony.springtheam.model.TitleInMenu;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "app")
public class ConfigProperties {
    private Site site;
    private TitleInMenu titleInMenu;
    private String title;
    private String logo;
    private String legende;
    private String login;

    private String prestation;
    private String offrePublic;
    private String offreProf;
    private String offreParticulier;

    private String products;
    private String addProduct;
    private String editProduct;
    private String deleteProduct;
    private String category;
    private String addCategory;
    private String newProductCategory;
    private String bestProductCategory;
    private String addCompany;
    private String addToWishList;
    private String deleteWishList;
    private String orderList;
    private String addToContact;
    private String productList;
    private String presentlyAddToCardProductList;
    private String recentlyEditProductList;
    private String outOfStockProduct;
    private String outOfStockCategory;
    private String categorytList;
    private String promotionCategories;
    private String updateAttributesCategorie;
    private String addBillingAddress;
    private String pointOfServices;
    private String sanitizedMonitoring;
    private String OthersService;

}
