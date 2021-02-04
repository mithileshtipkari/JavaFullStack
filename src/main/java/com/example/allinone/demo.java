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
public class demo {
    public static void main(String[] args) {
//        String ok = "The man sprang from his chair and paced up and down the room in uncontrollable agitation. Then, with a gesture of desperation, he tore the mask from his face and hurled it upon the ground. \"You are right,\" he cried; \"I am the King. Why should I attempt to conceal it?\"";
//        System.out.println("ok -"+ ok.length());


String textToBeTested = "How often do you find yourself using an interrogation point in your everyday writing? What about an eroteme? You might be surprised to know that both of these appeared in the last two sentences. These terms might be unfamiliar, but you may know this punctuation mark by its more common name: the question mark. The question mark has a very simple function in writing—it indicates a question. If a sentence ends with a question mark, then it is asking a question, just as the name suggests.";
            System.out.println("textToBeTested -"+ textToBeTested);
            
            long count = textToBeTested.chars().filter(c -> c == '?').count();
            System.out.println("len -"+ count);
    }
}
