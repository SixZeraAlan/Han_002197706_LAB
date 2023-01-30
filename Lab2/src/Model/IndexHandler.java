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
public class IndexHandler {
    public int[] indexHandler(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                arr[i] *= 2;
            } else {
                arr[i] *= 3;
            }
        }
        return arr;
    }
}
