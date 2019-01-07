/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotterysimulator;

import java.util.*;
import static java.util.stream.DoubleStream.generate;

/**
 *
 * @author UNILAG
 */
public class Lottery {
    public ArrayList<Integer> generateNumbers() {
        //Size of ArrayList
        int n = 5;
        
        //Value to be generated
        int genrate;
        
        //Create an ArrayList of Integers
        ArrayList<Integer> values = new ArrayList<> (n);
        
        //Exit the loop when the size of the ArrayList is 6
        while(values.size() < 6) {
            //Generate a random value between 1 and 36
            int generate = (int) (Math.random() * 36 + 1);
            
            //Filter out duplicate values
            if (!values.contains(generate)) {
                values.add(generate);
            }
        }
        return values;
    }
    
}
