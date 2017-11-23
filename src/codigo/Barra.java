package codigo;

import java.awt.Color;

import acm.graphics.GRect;

/**
 * Autor:Alejandro Lago 
 * 
 * la clase Barra es la que dibuja el cursor del juego
 */




public class Barra extends GRect {

	
	/**
	 * Crea el cursor del juego
	 * 
	 * @param width - el ancho
	 * @param height - el alto
	 * @param color - el color
	 */
	public Barra(double width, double height, Color color){
		super(width,height);
		setFilled(true);
		setFillColor(color);
		
		
		
	}
	
	
	/**
	 * mueveBarra reposiciona la barra en la coordenada 
	 * en la que esta el raton
	 * @param posX - posicion x del raton y la y la obtiene de la propia barra
	 * @param anchoPantalla - asi no hay que pasar nada mas
	 */
	
	public void mueveBarra(int posX, int anchoPantalla){
		if(posX + getWidth() < anchoPantalla){
			setLocation(posX, getY());
		}
		
	}

}
