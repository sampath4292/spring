package com.example.demo;
import com.example.demo.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.dao.ProductDAO;

@SpringBootApplication
public class ProductApplication_JDBC {
    
    public static void main(String[] args) {
        

        ApplicationContext context=SpringApplication.run(ProductApplication_JDBC.class, args);

    }

        @Bean
        CommandLineRunner runner(ProductDAO dao)
        {
            return args -> {

            Double avg = dao.getAvgPrice();

            System.out.println(avg);

        };
        };

        @Bean
        CommandLineRunner runner(ProductDAO dao){

            return args->{

                dao.getCategoryAverage()
                        .forEach(System.out::println);

            };

        }

        @Bean
        CommandLineRunner runner(ProductDAO dao){

            return args->{

                Category c=new Category(4,"Sports");

                dao.insertCategory(c);

                System.out.println("Inserted");

            };

        }

        @Bean
        CommandLineRunner runner(ProductDAO dao){

            return args->{

                dao.getProducts(1000)
                        .forEach(System.out::println);

            };

        }

}
