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

    @PutMapping("/{id}")
    public ResponseEntity<List> editProduct(@Valid @PathVariable int id, @RequestBody Product product) {
        int num = (int) id;

        for (int count = 0; count < myList.size(); count++) {
            if (myList.get(count).getId() == num)
                myList.set(count, product);
        }
        return ResponseEntity.ok(myList);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<List> deletedProduct(@Valid @PathVariable long id){
        int num = (int) id;

        for (int count = 0; count < myList.size(); count++)
        {
            if(myList.get(count).getId() == num)
                myList.remove(count);
        }
        return ResponseEntity.ok(myList);
    }


}

