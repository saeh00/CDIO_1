package com.company;
import java.util.Random;


public class Game {
    public static void main(String[] args) {

        Random rand = new Random();

        int min=1;
        int max=6;

        int dice_1;
        int dice_2;

        int diceSum = 0;

        String player1;
        String player2;

        int player1_point = 0;
        int player2_point = 0;

        int diceRoll_1, diceRoll_2;

        diceRoll_1 = rand.nextInt(max)+min;
        diceRoll_2 = rand.nextInt(max)+min;

        System.out.println(diceRoll_1 + diceRoll_2);

        while (player1_point || player2_point > 40){
        };




    }
}
