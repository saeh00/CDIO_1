package com.company;


import gui_fields.GUI_Player;
import gui_main.GUI;

import java.util.Random;

public class Game {

    public static void main(String[] args) {
        GUI gui = new GUI();
        gui.setDice(1,1);

        //Add users
        String Player_1 = gui.getUserString("indtast et navn");
        String Player_2 = gui.getUserString("indtast et navn");

        //Add users to board
        GUI_Player gui_Player_1 = new GUI_Player(Player_1);
        GUI_Player gui_Player_2 = new GUI_Player(Player_2);

        gui.addPlayer(gui_Player_1);
        gui.addPlayer(gui_Player_2);

        //Setting player startpoints
        gui_Player_1.setBalance(0);
        gui_Player_2.setBalance(0);

        //Dice attributes
        Random rand = new Random();
        int diceRoll_1, diceRoll_2, diceSum;
        int min=1;
        int max=6;
        int player1_points = 0;
        int player2_points = 0;
        int turn = 0;

        while (gui_Player_1.getBalance() < 40 || gui_Player_2.getBalance() < 40) {
            String knapString = gui.getUserSelection("Roll the dice", "Roll");

            if(gui_Player_1.getBalance() >= 40){

                knapString = gui.getUserString("Congrats " + Player_1 + " you won");

            }

            else if(gui_Player_2.getBalance() >= 40){

                knapString = gui.getUserString("Congrats " + Player_2 + " you won");
            }
            else if (knapString == "Roll" && turn == 0 && gui_Player_1.getBalance() < 40) {

                diceSum = 0; // Resetting dice sum


                diceRoll_1 = rand.nextInt(max) + min; // Rolling dice 1
                diceRoll_2 = rand.nextInt(max) + min;  // Rolling dice 2

                diceSum = diceRoll_1 + diceRoll_2; //Calculating dice Sum

                gui.setDice(diceRoll_1, diceRoll_2); //Assigning dice rolls to GUI

                player1_points = player1_points + diceSum; //Calculating player points
                gui_Player_1.setBalance(player1_points); //Assigning player points to GUI

                turn = 1;

            } else if (knapString == "Roll" && turn == 1 && gui_Player_2.getBalance() < 40) {
                diceSum = 0; //Reseting dice sum

                diceRoll_1 = rand.nextInt(max)+min; //Rolling dice 1
                diceRoll_2 = rand.nextInt(max)+min; //Rolling dice 2

                diceSum = diceRoll_1 + diceRoll_2; //Calculating dice sum

                gui.setDice(diceRoll_1, diceRoll_2); //Assigning dice rolls to GUI

                player2_points = player2_points + diceSum; //Calculating player points
                gui_Player_2.setBalance(player2_points); //Assigning player points GUI

                turn = 0;

            }







        }

    }
}
