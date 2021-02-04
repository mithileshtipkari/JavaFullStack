/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.allinone;

/**
 *
 * @author Mithilesh
 */
public class BinarySort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 6, 7, 8};
        int indexFound = searchElement(10, arr, 0, arr.length);
        System.out.println("index -"+ indexFound);
    }
    public static int searchElement(int ele, int[] arr, int startIndex, int endIndex){
        int indexFound = -1;
        int middleIndex = (startIndex + endIndex) / 2;
        if(arr[middleIndex] == ele){
            indexFound = middleIndex;
        } else if(arr[middleIndex] > ele){
            indexFound = searchElement(ele, arr, startIndex, (startIndex + middleIndex)/2);
        } else {
            indexFound = searchElement(ele, arr, (middleIndex + endIndex)/2, endIndex);
        }
        return indexFound;
    }
}
