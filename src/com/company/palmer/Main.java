package com.company.palmer;

public class Main {

    public static <integers> void main(String[] args) {

        int i = -2;

        while(i < 10){
            i+=2;
            System.out.println(i);
        }

        for(i = 0; i <= 10; i+=2){
            System.out.println(i);
        }

        i = 0;

        do{

            System.out.println(i);
            i+=2;

        }while(i <= 10);

        int integers[] = {1, 2, 3, 4, -1, -2, 10, -5, 8, -6};

        for(i = 0; i < integers.length; i++){

            if(integers[i] < 0){

                System.out.println(integers[i] + " is in this array and negative.");

            }

        }

        String name = "Bryson";
        System.out.println(name);

        String newName = name.substring(1, name.length()-1);

        System.out.println(newName);

    }
}
