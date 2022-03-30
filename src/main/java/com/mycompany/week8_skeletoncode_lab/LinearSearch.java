/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class LinearSearch {
    
    public static int search(int arr[], int x)
    {
        int n = arr.length; // O(1)
        
        for(int i=0; i <n; i++) //O(n)
        {
            if(arr[i] == x)//O(1)
                return i;//O(1)
        }
        return -1;//O(1)
        //Asymptotic analysis for linear search is O(n)
        
        // Todo 01: - complete the implementation of linear search and test your code  
         //         - provide asymptotic analysis of the developed solution
    }
    
        public static void main (String args[])
        {
            int arr[] = {10,20,30,40,50,60};
            int x = 40;
            
            int result = search(arr,x);
            if(result == -1)
                System.out.print("Element not found");
            else
                System.out.print("Element is found at index " + result);
                
        }
      
}
