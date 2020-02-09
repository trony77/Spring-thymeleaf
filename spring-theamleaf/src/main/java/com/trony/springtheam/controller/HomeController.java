package com.trony.springtheam.controller;

import com.trony.springtheam.form.ProductForm;
import com.trony.springtheam.model.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {
    private static List<ProductModel> products = new ArrayList<>();

    static {
        products.add(new ProductModel("Formation", "Formation prêt à l'emploie", 1899.99));
        products.add(new ProductModel("Accompagnement", "Aide et assistance ", 887.55));
        products.add(new ProductModel("Prestation", "Une mission à réalisée ", 1456.99));
    }

    //Injectez via application.properties
    @Value("${welcome.message}")
    private String message;

    @Value("${error.message}")
    private String errorMessage;

    @Value("${legend.site}")
    private String legend;

    @Value("${category.type.professionnal}")
    private String professionnal;

    @Value("${category.type.particulary}")
    private String particulary;

    @Value("${category.type.publicadministration}")
    private String publicadministration;

     @Value("${sign.up}")
    private String signUp;

    @Value("${logo.site}")
    private String logo;

    @Value("${title.site}")
    private String title;

    @Value("${sign.up}")
    private String signup;

    @RequestMapping(value = {"/", "/home", "/index"}, method = RequestMethod.GET)
    public String home(Model model) {
        model.addAttribute("products", products);
        model.addAttribute("legend", legend);
        model.addAttribute("title", title);
        model.addAttribute("logo", logo);
        model.addAttribute("signup", signup);
        model.addAttribute("professionnal", professionnal);
        model.addAttribute("particulary", particulary);
        model.addAttribute("publicadministration", publicadministration);
        return "index";
    }

    @RequestMapping(value = {"/productList"}, method = RequestMethod.GET)
    public String productList(Model model) {
        model.addAttribute("message", message);
        return "productList";
    }

    @RequestMapping(value = {"/product"}, method = RequestMethod.GET)
    public ModelAndView productPage(final Model model, final ProductModel product) {
        model.addAttribute("message", message);
        return new ModelAndView("product", "product", product.toString());
    }

    @RequestMapping(value = {"/addProduct"}, method = RequestMethod.GET)
    public String addProduct(Model model) {
        ProductForm productForm = new ProductForm();
        model.addAttribute("productForm", productForm);
        final String name = productForm.getName();
        final String description = productForm.getDescription();
        final Double price = productForm.getPrice();
        return "productList";

    }
}
