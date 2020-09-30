package com.company;


import gui_fields.GUI_Player;
import gui_main.GUI;

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
    }
}
