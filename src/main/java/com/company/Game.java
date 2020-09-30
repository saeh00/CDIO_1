package com.company;
import java.util.Random;
import java.util.Scanner;
import gui_main.GUI;

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




        while (player1_point < 40 || player2_point < 40){
            if (player1_point < 40){
                diceSum = 0;


                diceRoll_1 = rand.nextInt(max)+min;
                diceRoll_2 = rand.nextInt(max)+min;

                diceSum = diceRoll_1 + diceRoll_2;

                player1_point = player1_point + diceSum;

                System.out.println(player1_point + "p1");

            } else{
                System.out.println("Congratulations Player 1 has won");
                break;
            }

            if (player2_point < 40){
                diceSum = 0;

                diceRoll_1 = rand.nextInt(max)+min;
                diceRoll_2 = rand.nextInt(max)+min;

                diceSum = diceRoll_1 + diceRoll_2;

                player2_point = player2_point + diceSum;

                System.out.println(player2_point + "p2");
            } else{
                System.out.println("Congratulations Player 2 has won");
                break;
            }
        };




    }
}
