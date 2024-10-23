package ie.atu.cicd_lab5;

import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();

    public List<Product> addProduct(Product product) {
        //imagine that we have a CONNECTION TO A DATABASE
        myList.add(product);
        return myList;

    }

    public List<Product> deleteProduct(int id) {

        for (int count = 0; count < myList.size(); count++) {
            if (myList.get(count).getId() == id) {
                myList.remove(count);
            }
        }
        return myList;
    }

    public List<Product> editProduct(Product product, int id) {

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).getId() == id) {
                myList.set(i, product);
            }
        }
        return myList;
    }

}