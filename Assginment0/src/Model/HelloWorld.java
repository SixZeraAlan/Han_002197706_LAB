/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author alan
 */
public class HelloWorld {
    int age = 18;
    double weight = 66.6;
    String name = "Alan";
    Boolean graduated = true;
    char gender = 'M';
    int[] arr = new int[5];
    
    public static void main(String[] args) {
        HelloWorld hl = new HelloWorld();
        hl.arr[0] = 0;
        hl.arr[1] = 1;
        System.out.println("Age: " + hl.age);
        System.out.println("Weight: " + hl.weight + " kg");
        System.out.println("Name: " + hl.name);
        System.out.println("Graudated: " + (hl.graduated ? "Yes" : "Not yet"));
        System.out.println("Gender: " + hl.gender);
        System.out.println("I am the first element in arr: " + hl.arr[0]);
        System.out.println("I am the second element in arr: " + hl.arr[1]);
    }   
}
