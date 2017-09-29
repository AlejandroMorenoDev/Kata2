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
        int value;
        HashMap<Integer, Integer> histogram= new HashMap<Integer, Integer>();
        
        for(int i = 0; i < array.length; i++){
            if(histogram.containsKey(array[i])== false){
                histogram.put(array[i], 1);
                continue;
            }
            value = histogram.get(array[i]) +1;
            histogram.put(array[i], value);
        }
        for(int i = 0; i <= 3; i++){
            System.out.println("El número " +  i + " aparece: " 
                              + histogram.get(i) + "  veces");
        }
    }
    
}
