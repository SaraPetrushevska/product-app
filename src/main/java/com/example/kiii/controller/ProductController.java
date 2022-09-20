package com.example.kiii.controller;


import com.example.kiii.model.Product;
import com.example.kiii.repository.ProductRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping(value = {"/"})
public class ProductController {

    private final ProductRepository productRepo;

    public ProductController (ProductRepository productRepo) {
        this.productRepo = productRepo;
    }

    @GetMapping
    public String findAll(Model model) {

        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product(123L, "Computer", "asdasd"));

        model.addAttribute("products", products);
        return "index";

    }
}