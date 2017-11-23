package codigo;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;

/*
 * Autor: Alejandro Lago
 * 
 * El Arkanoid orientado a objetos
 * 
 */

import acm.graphics.*;
public class Arkanoid extends acm.program.GraphicsProgram {

	Pelota pelota1=new Pelota(10,Color.BLUE);

	Barra barra1 = new Barra(60, 15, Color.RED);
	int anchoLadrillo = 25;
	int altoLadrillo = 15;
	int numeroLadrillos =14;
	int numeroLadrillos2 =20;

	int puntuacion = 0;
	Marcador marcador = new Marcador(20, 40);
	int espacioMenu;





	public void init(){

		addMouseListeners();
		setSize(600,600);
		GRect lateral= new GRect(3, getHeight());
		lateral.setFilled(true);

		espacioMenu = getWidth()-numeroLadrillos*anchoLadrillo;//importante cambiar numeroLadrillos
		add(lateral,numeroLadrillos*anchoLadrillo,0);
		
		add(pelota1,0,getHeight()*0.60-pelota1.getHeight() );
		add(barra1,0,getHeight()*0.80);
		dibujaNivel01();
		add(pelota1);





	}




	public void run(){


		marcador.dibuja(this);
		while(true){
			pelota1.muevete(this);


			pause(4);
		}

	}

	public void mouseMoved(MouseEvent evento){
		barra1.mueveBarra(evento.getX(), numeroLadrillos*anchoLadrillo);//importante cambiar numeroLadrillos

	}


	private void dibujaNivel01(){
		for(int j=0; j<numeroLadrillos; j++){
			for(int i=j; i<numeroLadrillos; i++){
				Ladrillo miLadrillo = new Ladrillo(anchoLadrillo*i-anchoLadrillo*j/2 + (getWidth()-espacioMenu)/2- numeroLadrillos*anchoLadrillo/2,
						altoLadrillo*j + altoLadrillo,
						anchoLadrillo ,
						altoLadrillo,
						Color.PINK);
				add(miLadrillo);
				pause(10);

			}
		}

	} 



	private void dibujaNivel02(){


		for(int j=0; j<10 ;j++){
			for(int i=0; i<numeroLadrillos2; i++){
				Ladrillo miLadrillo = new Ladrillo(anchoLadrillo*i,altoLadrillo*j,anchoLadrillo,altoLadrillo,Color.PINK);
				add(miLadrillo);
				pause(10);
			}
		}

	}



}
