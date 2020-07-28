package com.company;

public class Main {

    public static void main(String[] args) {
        String[] words = {"funk", "chunk", "furry","baconator"};

        //starts with method
        for(String w: words){
            if(w.startsWith("fu")){
                System.out.println(w + "starts with fu");
            }
        }
        for(String w: words){
            if(w.endsWith("unk")){
                System.out.println(w + " starts with unk");
            }
        }
    }
}
