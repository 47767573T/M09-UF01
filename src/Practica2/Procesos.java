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
		while
		String respuesta = "";
		
		for (int i = posInicial ; posInicial <= posFinal-1 ; posInicial++) {				
			
			alea = rnd.nextInt(9); 
			
			respuesta += nombre+" en posicion "+i+" ,con valor "+alea+" ,en orden "+Padre.getTotalIntroducidos()+"�";			
			Padre.addToArray(i,respuesta);
			
		}
		
		public boolean cajaLlena () {
		
	}
	
	
	
	
}
