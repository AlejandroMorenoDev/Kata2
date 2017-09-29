/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kata2;
import java.util.*;

/**
 *
 * @author amct2
 */
public class Kata2 {
//Kata 2 version 1
    
    public static void main(String[] args) {
        // TODO code application logic here
        int [] array = {1, 1, 1, 0, 1, 2, 1, 0, 3};
        Histogram history = new Histogram(array);
        Map <Integer, Integer> histo = history.getHistogram();
        
        for (int i : array) {
            
        }
    }
}
