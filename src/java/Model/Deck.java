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
public class Deck 
{
    
    private int Number;
    private ArrayList<Card> cardquantity;
    
public Deck()
{
    cardquantity=new ArrayList<Card>();
 
}

public ArrayList<Card> getList()
{
    return cardquantity;
}
public int getNumber() 
{
    Number=	cardquantity.size();
    return Number;
}
public void setValue(int num) 
{
    Number = num;
}
public void AddCard(Card card)
{
    cardquantity.add(card);
}    
public void CreateNewDeck(){
    String x="";String y="";int z=0;
        String color[]={"Red","Yellow","Blue","Green","Black"};
        String type[]={"Normal","Reverse","Skip","Draw(+2)","Wild","Wild Draw(+4)"};
        int value[]={0,1,2,3,4,5,6,7,8,9,20,50};
       
        for(int j=0;j<4;j++){  
            x=color[j];
        for(int i=1;i<10;i++){
           y=type[0];
           z=value[i];
          Card a=new Card(x,y,z,x+y+z);
          Card b=new Card(x,y,z,x+y+z);
          AddCard(a);
          AddCard(b);
          }
           }
//Add 4 "0" Cards
for(int i=0;i<4;i++){
    x=color[i];y=type[0];z=value[0];
    Card a=new Card(x,y,z,x+y+z);
    AddCard(a);
}
//Add Functional Card
for(int i=0;i<4;i++){
    x=color[i];
    for(int j=1;j<4;j++){
        y=type[j];
        z=value[10];
        Card a=new Card(x,y,z,x+y+z);
        Card b=new Card(x,y,z,x+y+z);
        AddCard(a);
        AddCard(b);
    }
}
//Add Wild Card
for(int i=4;i<6;i++){
    x=color[4];
    y=type[i];
    z=value[11];
    Card a=new Card(x,y,z,x+y+z);
    Card b=new Card(x,y,z,x+y+z);
    Card c=new Card(x,y,z,x+y+z);
    Card d=new Card(x,y,z,x+y+z);
    AddCard(a);AddCard(b);AddCard(c);AddCard(d);
}
}

public Card TakeAcard(){
    int x=(int)(Math.random()*(cardquantity.size()-1));
  Card card= cardquantity.get(x);
  cardquantity.remove(x);
  return card;
}
	public void getcard() {
		Iterator<Card> i = cardquantity.iterator();
		while (i.hasNext()) {
                        System.out.println(i.next());                               
		}		
	}
}


