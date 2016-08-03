/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author eswar
 */
public class Game {
    
    private String gameID;
	   private ArrayList<Player> playerList;
	   private String status;
	   private Deck deck;
	   private String discardFile;
	   private ArrayList<Card> DiscardPile;
           public Game(String gameID) {
		super();
		this.gameID = gameID;
		deck=new Deck(); 
                playerList=new ArrayList<Player>();
                DiscardPile=new ArrayList<Card>();
	}
	
	public String getGameID() {
		return gameID;
	}
	public void setGameID(String gameID) {
		this.gameID = gameID;
	}
        public Deck getdeck(){
            return deck;
        }
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDiscardFile() {
		return discardFile;
	}
	public void setDiscardFile(String discardFile) {
		this.discardFile = discardFile;
	}
	 

       public void addplayer(Player player){
           playerList.add(player);
       }
	
      public void CreateNewGame(){
          	getdeck().CreateNewDeck();
      }
     public void StartGame(){
         discardACard(getdeck().TakeAcard());
         for(int j=0;j<7;j++){
		for(int i=0;i<playerList.size();i++){
              playerList.get(i).addCardtoHand(deck);
		} 
     }
     }
     
     public Card discardACard(Card c){
         Card card=c;
         DiscardPile.add(card);
         return card;
     }
     public void showDiscardPile(){
         System.out.println("Discard :");
         Iterator<Card> c = DiscardPile.iterator();
         while(c.hasNext()){
              System.out.println(c.next());
         }
     }
     public void showPlayerList(){
         Iterator<Player> p = playerList.iterator();
                  while (p.hasNext()) {                 
                  p.next().show();
                   }
     }
     public void showGameInformation(){
         System.out.println("Game ID: "+gameID);
         showDiscardPile();
         System.out.println("Cards on deck "+deck.getNumber());
         System.out.println();
         showPlayerList();
     }
     
       public void TakeAcardFromDeck(Deck deck){
           Card x=new Card("a","b",1,"c");
     
       }
	}


