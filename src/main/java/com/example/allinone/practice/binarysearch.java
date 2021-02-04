/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.allinone.practice;

/**
 *
 * @author Mithilesh
 */
public class binarysearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("found at - "+ binarySearch(arr, 10, 0, arr.length-1));
    }
    
    public static int binarySearch(int[] arr, int ele, int startIndex, int endIndex){
        //time complexity - O(logn)
        if(startIndex <= endIndex){
            int middleIndex = (startIndex + endIndex) / 2;
            if(arr[middleIndex] == ele) return middleIndex;
            if(ele < arr[middleIndex]) return binarySearch(arr, ele, startIndex, middleIndex - 1);
            else return binarySearch(arr, ele, middleIndex+1, endIndex);
        }
        return -1;
    }
}
