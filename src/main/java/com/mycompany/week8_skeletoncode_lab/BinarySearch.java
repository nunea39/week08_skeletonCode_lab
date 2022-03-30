/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week8_skeletoncode_lab;

/**
 *
 * @author MoaathAlrajab
 */
public class BinarySearch {

    public static int runBinarySearchIteratively(int[] sortedArray, int key, int low, int high) 
    {
        int index = Integer.MAX_VALUE;            //O(1)

        while (low <= high) {                     //O(n)
            int mid = low + ((high - low) / 2);   //O(log n)
            if (sortedArray[mid] < key) {         //O(1)
                low = mid + 1;                    //O(1)
            } else if (sortedArray[mid] > key) {  //O(1)
                high = mid - 1;                   //O(1)
            } else if (sortedArray[mid] == key) { //O(1)
                index = mid;                      //O(1)
                break;
            }
        }
        return index;                             //O(1)
    }
    //ToDo 2: Call the above method and test the algorithm  
    // provide time and space analysis 
    
    public static void main(String [] args){
        
        int[] sortedArray = {1,2,3,4,5,6,7,8,9,10};
        int key = 2;
        int low = 0;
        int high = sortedArray.length;

        
        
        System.out.print(runBinarySearchIteratively(sortedArray, key, low, high));
    }

}
