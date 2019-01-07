/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotterysimulator;

import java.util.*;

/**
 *
 * @author UNILAG
 */
public class LotterySimulator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Create an instance of the lottery class
        Lottery lottery = new Lottery();
        
        //Generate the numbers for the lottery
        ArrayList<Integer> values = lottery.generateNumbers();
        
        //Print out 6 random values
        System.out.println(values.get(0));
        System.out.println(values.get(1));
        System.out.println(values.get(2));
        System.out.println(values.get(3));
        System.out.println(values.get(4));
        System.out.println(values.get(5));
        
    }
    
}
