/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.allinone.practice;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

/**
 *
 * @author Mithilesh
 */
public class Linearsearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
//        int foundAt = linearSearch(arr, 5);
//        System.out.println("found at -"+ foundAt);

//        int ok = optimizedLinearSearch(arr, 6);
//        System.out.println("ok -"+ ok);

            //range tester
            IntStream.rangeClosed(1, 10).forEach(System.out::println);
    }
    
    public static int linearSearch(int[] arr, int ele){
        //using foreach
//        IntStream.range(0, arr.length).filter(index -> arr[index] == ele).forEach(System.out::println);
//                forEach((index) -> {
//            if(arr[index] == ele) return index;
//        });
        for(int i=0; i<arr.length; i++){
            if(arr[i] == ele) return i;
        }
        return -1;
    }
    
    public static int optimizedLinearSearch(int[] arr, int ele){
//        int left = 0;
//        int right = arr.length-1;
        //for worst case scenarios if ele is at end, O(n) gets converted to O(1)
        //and if no ele is found - O(n) gets converted to O(n/2)
        for(int left = 0, right = arr.length-1; left<=right;){
            if(arr[left] == ele) return left;
            if(arr[right] == ele) return right;
            left++;
            right--;
        }
        return -1;
    }
}
