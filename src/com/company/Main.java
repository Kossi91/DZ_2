package com.company;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
       System.out.println(goForAWalk(25,20));
       System.out.println(goForAWalk(15,15));
       System.out.println(goForAWalk(20,27));
       System.out.println(goForAWalk(31,27));
       System.out.println(goForAWalk(29,14));
       System.out.println(goForAWalk(generateRandomAge(),20));
        System.out.println("Hello word");

    }
    public static String goForAWalk(int age,int temp){
        if(age>=20 & age<=45 & temp >=-20 & temp <=30)
        return "Mojno idti gulyat";

        else if (age <20 & temp >=0 & temp <=28)
            return "Mojno idti gulyat";

        else if (age >45 & temp >=-10 & temp <=25)
            return "Mojno idti gulyat";

        else
            return "Ostavaytesi doma";

    }
    public static int generateRandomAge(){
        Random rand = new Random();
        int min = 1;
        int max = 100;
        int randomAge = rand.nextInt(max-min)+1;
        System.out.println(randomAge);
        return randomAge;
    }
}
