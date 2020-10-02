package com.company;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        Random rand = new Random();
        int diceRoll_1, diceRoll_2, diceSum;
        int min=1;
        int max=6;
        int diceThrows = 0;
        int diceSumAvg = 0;

        while (diceThrows <= 10000){
            diceRoll_1 = rand.nextInt(max) + min; // Rolling dice 1
            diceRoll_2 = rand.nextInt(max) + min; // Rolling dice 2

            diceSum = diceRoll_1 + diceRoll_2; // Calculating dice sum

            diceSumAvg = diceSumAvg + diceSum;

            diceThrows++;
        }
        System.out.println(diceSumAvg/10000.0);
    }


}
