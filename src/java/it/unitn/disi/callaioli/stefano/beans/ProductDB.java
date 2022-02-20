package it.unitn.disi.callaioli.stefano.beans;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Scanner;
import javax.servlet.http.HttpSession;

/**
 *
 * @author StefanoCallaioli
 */

public class ProductDB implements Serializable{
    private HashMap<Integer,ProductBean> products = new HashMap<>(); 
    private String category;

    public ProductDB() {
    }
    
    //Popula la HashMap products con prodotti della categoria richiesta associandogli un id crescente
    public ProductDB(HttpSession session, String category) throws FileNotFoundException {

        File file = new File(session.getServletContext().getRealPath("/WEB-INF/data/"+ category +".txt"));
        Scanner sc = new Scanner(file, "UTF-8");
        
        String name, price, description;
        int id=0;
        while (sc.hasNextLine()){
            id++;
            name=sc.nextLine();
            sc.nextLine();
            description=sc.nextLine();
            sc.nextLine();
            price=sc.nextLine();
            sc.nextLine();
            this.category=category;
            products.put(id, new ProductBean(name,price,description,category));
        }
        
    }
    public HashMap<Integer, ProductBean> getProducts() {
        return products;
    }

    public String getCategory() {
        return category;
    }
    
    public void setProducts(HashMap<Integer, ProductBean> products) {
        this.products = products;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    //Aggiunge alla HashMap products un prodotto associandogli un id crescente
    public void addProduct(ProductBean product) {
        this.products.put(products.size()+1, product);
    }



}
