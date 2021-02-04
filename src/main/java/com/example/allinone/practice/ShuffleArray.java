/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.allinone.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mithilesh
 */
public class ShuffleArray {
    public static void main(String[] args) {
        int[] resultArr = otherMethod(new int[]{1,2,3,4,5,6});
        Arrays.stream(resultArr).forEach(System.out::println);
//        }
    }
    
    public static int[] otherMethod(int[] arr){
        int[] result = new int[arr.length];
        double randomAdder = Math.random()*10;
        for(int i=0; i<arr.length; i++){
            double newIndex = (i + randomAdder)%arr.length;
            System.out.println("new -"+ newIndex);
            result[(int)newIndex] = arr[i];
        }
        return result;
    }
    
    public static int[] shuffleIt(int[] inputArr){
        int[] arr = new int[inputArr.length];
//        System.out.println("math -"+ );
//        System.out.println("get -"+ getRandomIndex(inputArr.length));
        Map<Integer, String> isEleShuffled = new HashMap<>();
        Arrays.stream(inputArr).forEach(ele->{
            int randomIndex = getRandomIndex(inputArr.length);
            if(isEleShuffled.get(randomIndex) == null){
                isEleShuffled.put(randomIndex, "yes");
                arr[randomIndex] = ele;
            } else{
                randomIndex = getRandomIndex(inputArr.length);
            }
//            System.out.println("ok-"+getRandomIndex(inputArr.length));
        });
        return arr;
    }
    
    public static int getRandomIndex(int len){
        double random = Math.random()*10;
        while(random > len){
            return getRandomIndex(len);
        }
        return (int)random;
    }
}
