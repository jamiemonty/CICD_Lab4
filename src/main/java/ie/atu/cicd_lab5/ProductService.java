package ie.atu.cicd_lab5;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        //imagine that we have a CONNECTION TO A DATABASE
        myList.add(product);
        return myList;

    }
}
