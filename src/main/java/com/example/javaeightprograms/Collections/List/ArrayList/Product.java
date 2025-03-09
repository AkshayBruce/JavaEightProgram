package com.example.javaeightprograms.Collections.List.ArrayList;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

//@lombok
@Data
@Builder
//@AllArgsConstructor
@NoArgsConstructor
public class Product {
    private int id;
    private String name;
    private double price;

Product(int id, String name, double price){
this.id = id;
this.name = name;
this.price = price;
}

public void setid(int id){
    this.id = id;
}
public int getId(){
 return id;
}

public void setName(String name){
    this.name = name;
}
public String getName(){
    return name;
}
public void setPrice(double price){
    this.price = price;
}
public double getPrice(){
    return price;
}

@Override
public String toString(){
    return "Product ID:"+id+"Name:"+ name+ "Price:"+price;
}

@Override
    public boolean equals(Object obj)
    {
    if(obj instanceof Product){
        Product p = (Product)obj;
    }
        return false;
    }

}
