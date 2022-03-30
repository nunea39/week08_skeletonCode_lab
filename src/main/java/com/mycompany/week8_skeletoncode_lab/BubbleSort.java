/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;//O(1)
        for (outer = size - 1; outer > 0; outer--) { // counting down   <-- O(n)
            for (inner = 0; inner < outer; inner++) { // bubbling up    <-- O(n)            
                if (a[inner] > a[inner +1]){//O(1)
                    temp = a[inner];//O(1)
                    a[inner] = a[inner +1];//O(1)
                    a[inner + 1] = temp;//O(1)
                } // The time complexity is O(n2)
                //ToDo 3: complete this algorithm, test it, provide its time complexity
            }
        }
    }
    
    public static void main (String[] args){
        
        int [] arr = {12, 19, 2, 1, 7, 20};
        int size = 6;
        
        bubbleSort(arr, size);
        System.out.print("Bubble sort: \n");
        for (int i = 0; i <arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    
}
