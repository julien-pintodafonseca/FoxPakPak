/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foxpakpak.main;

import foxpakpak.main.game.Game;
import foxpakpak.main.game.map.Map;

/**
 *
 * @author jp032952
 */
public class FoxPakPak {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String title = "TheFoxPakPak";
        int width = 720;
        int height = 400;
        int scale = 2;        
        
        Map laMap = new Map();
        //laMap.generateMap("C:\\Users\\ap594025\\Downloads\\lev1.txt");
        
        Game myFoxPakPak = new Game(width*scale, height*scale, title);
        myFoxPakPak.jouer();
    }
    
}
