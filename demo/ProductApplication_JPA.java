import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

import com.example.demo.Entity.Product;
import com.example.demo.Services.ProductService;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductApplication_JPA{

    public static void main(String[] args) {

        SpringApplication.run(ProductApplication_JDBC.class, args);

    }
    @Bean
    CommandLineRunner runner(ProductService productService){

        return args ->{

            Product product =
                    new Product(
                            101,
                            "Laptop",
                            65000.0);

            productService.saveProduct(product);

            System.out.println("Product Saved Successfully");

        };

    }

}
