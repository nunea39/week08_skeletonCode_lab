/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class Problem01 {
    
    public static long getSumOfPrimes(int n){
        
        int count,sum = 0;
        
        for(int i =1; i <= n; i++){     //O(n)
            count=0;                    //O(1)
            for(int j=2; j<=i/2; j++){  //O(log n)
                if(i%j == 0){           //O(1)
                    count++;            //O(1)
                    break;              //O(1)
                }
            }
            if(count == 0 && i !=1){    //O(1)
                sum = sum +i;           //O(1)
            }
        }
        
       //Time complexity is O(n log n)

    // Todo 04: Develop a method that returns the sum of the prime numbers between 1 and n
    //          Test your solution
    //          Analyze its space and time  
        return sum;

    }
    
    public static void main(String[] args){
        
        int n = 100;
        
        System.out.println("The sum of prime numbers from 1 to " + n+ " is: " 
                +getSumOfPrimes(n));
    }
    
}
