package ie.atu.cicd_lab5;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {

    private ProductService myProduct;

    public ProductController(ProductService myProduct) {
        this.myProduct = myProduct;
    }


    private List<Product> myList = new ArrayList<>();

    @PostMapping("/newProduct")
    public List<Product> newProduct(@Valid @RequestBody Product product) {
        //business logic to add this to a database
        //return list of all products from the database
        return myProduct.addProduct(product);
    }

    @PutMapping("/editProduct/{id}")
    public List<Product> editProduct(@Valid @RequestBody Product product, @PathVariable int id)
    {
        return myProduct.editProduct(product, id);
    }
    @DeleteMapping("/deleteProduct/{id}")
    public List<Product> deletedProduct(@Valid @PathVariable int id)
    {
        return myProduct.deleteProduct(id);
    }


}

