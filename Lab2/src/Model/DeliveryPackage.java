/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;

/**
 *
 * @author alan
 */
public class DeliveryPackage {
    
    int packageId;
    double packageWeight;
//    ArrayList<Product> productList;
    Product product;
    Customer customer;

    public DeliveryPackage() {
        this.product = new Product();
//        this.productList = new ArrayList<Product>();
        this.customer = new Customer();
    }

    public int getPackageId() {
        return packageId;
    }

    public void setPackageId(int packageId) {
        this.packageId = packageId;
    }

    public double getPackageWeight() {
        return packageWeight;
    }

    public void setPackageWeight(double packageWeight) {
        this.packageWeight = packageWeight;
    }

//    public ArrayList<Product> getProductList() {
//        return productList;
//    }
//
//    public void setProductList(ArrayList<Product> productList) {
//        this.productList = productList;
//    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

//    public Product createProduct(int productId, String productName, double price) {
//        // create new prod object
//        Product product = new Product();
//
//        // set the attributes
//        product.setProductId(productId);
//        product.setProductName(productName);
//        product.setPrice(price);
//
//        // add it to list
//        this.productList.add(product);
//
//        return product;
//    }

//    public Product findProduct(int pid) {
//        for (Product prod : this.productList) {
//            if (prod.getProductId() == pid) {
//                return prod;
//            }
//        }
//        return null;
//    }

    
    
}
