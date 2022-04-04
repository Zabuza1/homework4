package com.company;

public class Main {

    public static void main(String[] args) {
	// Задача 1
        int i =1;
        while (i <=10){
            System.out.print(i++ + " ");
        }
        System.out.println();
        for (i=10; i>0; i--) {
            System.out.print(i + " ");
        }
        System.out.println();

        //Задача 2
        for (int f= 4; f<=31;f = f+7)
            System.out.println("today is friday " + f + ". Prepare ur report");

        //Задача 3
        for (int comet = 1817; comet <=2117; comet = comet +79) {
            System.out.println("comet will arrive in " + comet);
        }
            }
        }



