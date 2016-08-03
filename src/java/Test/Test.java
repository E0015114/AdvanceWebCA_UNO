/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Model.Game;
import Model.Player;

/**
 *
 * @author eswar
 */
public class Test {
    
        public static void main (String args[]) {
            
        Player a=new Player("001","Eswar");Player b=new Player("002","Ajith");Player c=new Player("003","Vijay");
        Player d=new Player("004","Rajni");Player e=new Player("005","Kamal");
        Game game=new Game("UNO-001");
        game.CreateNewGame();//creates a new game deck
        game.addplayer(a);game.addplayer(b);game.addplayer(c);//add players
        game.addplayer(d);game.addplayer(e);
        game.StartGame();//discard a card and send initial cards for players
        game.showGameInformation();
        }
}

