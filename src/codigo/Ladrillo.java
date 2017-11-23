package codigo;

import java.awt.Color;

import acm.graphics.GRect;

/**
 * 
 * @author Alejandro Lago
 * 
 * 
 * aqui vamos a construir la piramide de ladrillos
 *
 */

public class Ladrillo extends GRect {

	public Ladrillo(double x, double y, double width, 
			double height, Color color) {
		super(x, y, width, height);
		setFilled(true);
		setFillColor(color);
	}
	
	

}
