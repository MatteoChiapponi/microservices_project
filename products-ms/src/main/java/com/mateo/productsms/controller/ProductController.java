package com.mateo.productsms.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @GetMapping
    public ResponseEntity<List<String>> helloWorld(@RequestHeader(value = "X-Request-from",required = false) String requestOrigin) {
       if (requestOrigin == null){
           return ResponseEntity.ok(List.of("prod1","prod2","prod3","instance 1"));
       }

        return ResponseEntity.ok(List.of("prod1","prod2","prod3", requestOrigin));
    }
}
