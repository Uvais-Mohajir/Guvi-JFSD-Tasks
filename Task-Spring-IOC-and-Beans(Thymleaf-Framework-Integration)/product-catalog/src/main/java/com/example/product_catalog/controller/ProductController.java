package com.example.product_catalog.controller;

import com.example.product_catalog.entity.Product;
import com.example.product_catalog.repository.ProductRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/add-product")
    public String showAddForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }
    @PostMapping("/save-product")
    public String saveProduct(@ModelAttribute Product product) {
        productRepository.save(product);
        return "redirect:/display-products";
    }
    @GetMapping("/display-products")
    public String displayProducts(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("products", products);
        return "display-products";
    }
}
