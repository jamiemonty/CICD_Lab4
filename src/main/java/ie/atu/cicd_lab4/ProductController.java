package ie.atu.cicd_lab4;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private List<Product> myList = new ArrayList<>();

    @PostMapping("/newProduct")
    public List<Product> newProduct(Product product)
    {
        ProductService myProduct = new ProductService();
        myList = myProduct.addProduct(product);
        //business logic to add this to a database
        //return list of all products from the database
        return myList;
    }
}
