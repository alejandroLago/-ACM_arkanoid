package codigo;

import java.awt.Color;
import java.awt.Font;

import acm.graphics.GLabel;
import acm.graphics.GRect;

public class Marcador extends GRect {

	GLabel texto=new GLabel("");


	public Marcador(double width, double height) {
		super(width, height);
		setFilled(true);
		setFillColor(Color.WHITE);
		texto.setLabel("Hola");
		texto.setFont(new Font("Verdana", Font.BOLD, 18));

	}
	
	
	public void dibuja(Arkanoid arkanoid){
		
		arkanoid.add(this, arkanoid.getWidth()-50, getY());
		arkanoid.add(texto,arkanoid.getWidth()-50, getY()+30);
		
		
		
		
		
		
		
		
	}


}
