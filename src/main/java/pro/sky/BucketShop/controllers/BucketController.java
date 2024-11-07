package pro.sky.BucketShop.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.BucketShop.services.BucketService;

import java.util.List;

@RestController
@RequestMapping(path = "store")
public class BucketController {
    private final BucketService bucketService;

    @Autowired
    public BucketController(BucketService bucketService) {
        this.bucketService = bucketService;
    }

    @GetMapping(path = "order/add")
    public String addProduct(@RequestParam("productId") List<Integer> ids) {
        bucketService.add(ids);
        return "Success";
    }

    @GetMapping(path = "order/get")
    public Object getProducts() {
        return bucketService.get();
    }



}

