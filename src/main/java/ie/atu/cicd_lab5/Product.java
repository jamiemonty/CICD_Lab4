package ie.atu.cicd_lab5;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
    @Min(value = 1, message = "Must be greater or equal to 1")
    private int id;
    @NotBlank(message = "You must enter a name")
    private String name;
    @Min(value = 0, message = "Must be greater or equal to 0")
    private double price;
}
