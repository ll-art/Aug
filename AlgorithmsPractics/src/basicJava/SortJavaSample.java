package basicJava;
//A sample Java program to sort an array of integers 
//using Arrays.sort(). It by default sorts in 
//ascending order 

import java.util.Arrays;
import java.util.Collections;

public class SortJavaSample {

    public static void main(String[] args) 
    { 
        // Our arr contains 8 elements 
        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
  
//        Arrays.sort(arr); 
//        System.out.printf("Ascending arr[] : %s", 
//                          Arrays.toString(arr)); 
        Arrays.sort(arr, 1, 4); //includes #from, excludes #to !!!!!
        System.out.printf("Partial sorted arr[] : %s", 
                Arrays.toString(arr)); 
        
        // Sorts arr[] in descending order 
        Arrays.sort(arr, Collections.reverseOrder());
//        Arrays.sort(arr, Collections.reverseOrder()); 
        
        System.out.printf("Descending arr[] : %s", 
                          Arrays.toString(arr)); 
    } 

}
//ArrayList and Vector both implement Collection
//Vector methods are all synchronized. 
//So using it from multiple threads is "safe". 
//You only need to synchronize if you need a read-evaluate-write process to be atomic. ... 
//If the shared state is the Vector object, then you need to synchronize on the instance of your Vector, not on an instance of your own classes.