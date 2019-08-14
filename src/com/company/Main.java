// package com.company;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int n;

        double temp = 0;
        int temp2 = 0;

        // System.out.println("Please type the number of villages");
        n = s.nextInt();

        double[] villages = new double[n];
        double[] villageSizes = new double[n-2];

        // System.out.println("Please begin entering size of the individual villages");

        for (int i = 0; i < villages.length; i++){

            villages[i] = s.nextInt();
        }

        Arrays.sort(villages);

        for (int i = 0; i < villages.length; i++){

            if (temp2 == 1){

                if (i != (n-1)) {

                    villageSizes[i - 1] = temp + ((villages[i + 1] - villages[i]) / 2);


                    // System.out.println(i + ". " + temp + " + " + ((villages[i + 1] - villages[i]) / 2) + " = " + ((villageSizes[i - 1])));

                    temp = 0;
                    temp2 = 0;

                }

            }

            if (i != (n-1)) {

                // System.out.println(i);

                temp = (villages[i+1] - villages [i]) / 2;

                temp2++;

            }

        }


        Arrays.sort(villageSizes);

        System.out.printf("%.1f", villageSizes[0]);



    }
}

