// Leke Obayemi
// Exercise 2
// 1/27/22

package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] currentTemperatures = {45, 29, 10, 22, 41, 28, 33};
        int[] precipitation = {95, 60, 25, 5, 0, 75, 90};

        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i]);    //Prints out all 7 days of the week
            System.out.println(currentTemperatures[i]); //Prints out temperatures for each day
            if(currentTemperatures[i] < 32 &&  precipitation[i] > 50){   //If the temperature is below 32 and the precipitation is above 50%
                System.out.println("It is likely to snow");
            }
        }
    }

}
