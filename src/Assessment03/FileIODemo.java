package Assessment03;

//File I/O and JSON. Define a Product record or class with id, name, and price.
// Write a Java program that uses java.nio.file.Files and
// Path to write a list of products to a JSON file using Jackson ObjectMapper,
// then reads the JSON file back and prints the products. Include basic exception handling.
// Do not use ObjectOutputStream or Java native serialization.

import com.fasterxml.jackson.databind.ObjectMapper;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

class Product{
    public int id;
    public String name;
    public double price;

    public Product() {
    }

    public Product(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }
}

public class FileIODemo {
    public static void main(String[] args){

        try {
            ObjectMapper mapper = new ObjectMapper();
            List<Product> products = new ArrayList<>();

            products.add(new Product(101, "Laptop", 52000));
            products.add(new Product(102, "Mobile", 34000));
            products.add(new Product(103, "Watch", 500));

            Path path = Paths.get("./Products.json");

            mapper.writeValue(path.toFile(), products);

            Product[] savedProducts = mapper.readValue(Files.readString(path), Product[].class);

            for(Product p:savedProducts){
                System.out.println(p.id+' '+p.name+' '+p.price);
            }
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}
