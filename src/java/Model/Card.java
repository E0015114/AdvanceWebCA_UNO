/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author eswar
 */
public class Card {
    private String Color;
    private String Type;
    private int value;
    private String Image;
    
        public Card(String color, String type, int value, String image) 
    {		
		Color = color;
		Type = type;
		this.value = value;
		Image = image;
	}
public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		Color = color;
	}
	public String getType() {
		return Type;
	}
	public void setType(String type) {
		Type = type;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getImage() {
		return Image;
	}
	public void setImage(String image) {
		Image = image;
	}
 @Override     
    public String toString () {
        return ("Card: Color="+Color+", Type="+Type + ", Value=" + value+", Image="+Image);
    }


    
}
