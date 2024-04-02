package JavaPrototype;
import JavaPrototype.prototype.PriceList;
import JavaPrototype.prototype.Product;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Lista de precios inicial
        PriceList priceList = new PriceList("Lista normal");
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Computadora", 650000));
        productList.add(new Product("Mouse", 120000));
        productList.add(new Product("Teclado", 80000));
        productList.add(new Product("Pantalla", 1350000));
        productList.add(new Product("Auriculares", 40000));
        priceList.setProductList(productList); 

        System.out.println(priceList + "\n");


        // Segunda lista de precios con descuento
        PriceList priceList2 = (PriceList) priceList.clone();
        priceList2.setName("Lista Prefer");

        for (Product product : priceList2.getProductList()){
            product.setPrice(product.getPrice() * 0.9);
        }

        System.out.println(priceList2+"\n");


        // Tercera lista de precios con descuento
        PriceList priceList3 = (PriceList) priceList.clone();
        priceList3.setName("Lista VIP");

        for (Product product : priceList3.getProductList()){
            product.setPrice(product.getPrice() * 0.5);
        }

        System.out.println(priceList3+ "\n") ;
    }
}