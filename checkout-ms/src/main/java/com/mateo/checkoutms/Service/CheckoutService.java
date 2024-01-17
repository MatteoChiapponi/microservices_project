package com.mateo.checkoutms.Service;

import com.mateo.checkoutms.feingClients.IProductsFeingClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CheckoutService {

    private final IProductsFeingClient IProductsFeingClient;

    public List<String> getProducts(){
        var prods = IProductsFeingClient.getAllProducts();
        //checkout prods
        prods.add("products validated");
        System.out.println(prods.get(prods.size()-2));
        return prods;
    }

}
