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
public class Player {
    
 private String ID;
   private String Name;
   	private ArrayList<Card> CardsinHand;
   public Player(String id,String name){
        ID=id;Name=name;
         CardsinHand=new ArrayList<Card>();
}
   	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
   	public String getID() {
		return ID;
	}
	public void setID(String id) {
		ID = id;
	}

        
   public void addCardtoHand(Deck c){
       CardsinHand.add(c.TakeAcard());
   }
   public void GetCardsinHand(){
       		Iterator<Card> i = CardsinHand.iterator();
		while (i.hasNext()) {
                     System.out.println(i.next());     
   }

   }
    @Override     
    public String toString () {
        return ("Player Id: "+ID+", Name: "+Name);
    }
    public void show(){
        System.out.println(this);
        System.out.println("Cards in hand:");
        GetCardsinHand();
        System.out.println();
    }
   public void removeCardfromHand(Card card){
       CardsinHand.remove(card);
   }
}

