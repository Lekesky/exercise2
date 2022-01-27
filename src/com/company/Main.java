package com.company;

public class Main {

    public static void main(String[] args) {
	    String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[] currentTemperatures = {45, 29, 10, 22, 41, 28, 33};
        int[] humidity = {95, 60, 25, 5, 0, 75, 90};

        for (int i = 0; i < week.length; i++) {
            System.out.println(week[i]);
            System.out.println(currentTemperatures[i]);
            if(currentTemperatures[i] < 32 &&  humidity[i] > 32){
                System.out.println("It is likely to snow");
            }
        }
    }
}
