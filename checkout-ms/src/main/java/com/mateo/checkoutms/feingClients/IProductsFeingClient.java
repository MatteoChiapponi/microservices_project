package com.mateo.checkoutms.feingClients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient("products-service")
public interface IProductsFeingClient {
    @RequestMapping(method = RequestMethod.GET, value = "/products")
    List<String> getAllProducts();
}
