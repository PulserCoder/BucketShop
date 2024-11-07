package pro.sky.BucketShop.services;

import java.util.List;

public interface BucketService {
    void add(List<Integer> productIds);
    List<Integer> get();
}
