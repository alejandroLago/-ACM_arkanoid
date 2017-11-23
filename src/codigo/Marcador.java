package codigo;

import java.awt.Color;
import java.awt.Font;

import acm.graphics.GLabel;
import acm.graphics.GRect;

public class Marcador extends GRect {

	GLabel texto=new GLabel("");
	int puntuacion=0;

	public Marcador(double width, double height) {
		super(width, height);
		setFilled(true);
		setFillColor(Color.WHITE);
		texto.setLabel("0");
		texto.setFont(new Font("Verdana", Font.BOLD, 18));

	}


	public void dibuja(Arkanoid arkanoid){

		arkanoid.add(this, arkanoid.getWidth()-50, getY());
		arkanoid.add(texto,arkanoid.getWidth()-50, getY()+30);

	}
	
	
	public void actualizaMarcador(int puntos){
		puntuacion+=puntos;
		texto.setLabel("" + puntuacion);
		
	}




}
