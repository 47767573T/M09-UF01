package Practica2;

import java.util.Random;
import java.util.Calendar;
import java.util.Date;


public class Procesos extends Thread {
	
	private String nombre;
	private int posInicial;
	
	public Procesos(String nombre, int posInicial) {
		this.nombre = nombre;
		this.posInicial = posInicial;
	}
	
	@Override
	public void run (){
		Random rnd = new Random();	
		int posFinal = posInicial +10;		
		int alea;
		
		String respuesta = "";
		
		for (int i = posInicial ; posInicial < posFinal ; posInicial++) {				
			
			alea = rnd.nextInt(9)+1; 
			
			respuesta += nombre+" en posicion "+i+" ,con valor "+alea+" ,en orden "+Padre.getTotalIntroducidos();			
			
			
			
		}
		
		
	}
	
	
	
	
}
