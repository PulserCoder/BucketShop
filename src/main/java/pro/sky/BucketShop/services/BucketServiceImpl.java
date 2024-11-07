package pro.sky.BucketShop.services;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.ArrayList;
import java.util.List;

@Service
@SessionScope
public class BucketServiceImpl implements BucketService {
    private static final Log log = LogFactory.getLog(BucketServiceImpl.class);
    ArrayList<Integer> products = new ArrayList<>();

    @Override
    public void add(List<Integer> productIds) {
        products.addAll(productIds);
        log.info("Added " + products.size() + " products");
    }

    @Override
    public List<Integer> get() {
        return products;
    }
}
