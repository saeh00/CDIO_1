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
        GUI_Player gui_player_1 = new GUI_Player(Player_1);
        GUI_Player gui_player_2 = new GUI_Player(Player_2);

        gui.addPlayer(gui_player_1);
        gui.addPlayer(gui_player_2);

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

    }
}
