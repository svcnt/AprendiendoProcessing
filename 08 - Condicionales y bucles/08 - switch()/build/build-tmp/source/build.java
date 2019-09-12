import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class build extends PApplet {

/* 

Aprendiendo Processing - switch()

- Cambia de cuadrado a c\u00edrculo cada 100 fotogramas

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
//variable que modifica el switch
int contador = 0;

//SETUP
public void setup() {
	size(400,400);
	background(0xff202020);
	stroke(255);
	fill(0xff202020);
	rectMode(CENTER);
}

//LOOP
public void draw() {
	//suma 1 a 'contador' cada 100 fotogramas
	if (frameCount % 100 == 0) {
	 	contador++;
	 } 
	
	switch (contador) {
		//se ejecuta por defecto
		default :
			rect(width/2, height/2, 300, 300);
		break;	
		//si 'contador' es igual a 1
		case 1 :
			background(0xff202020);
			ellipse(width/2, height/2, 300, 300);
		break;
		//si 'contador' es igual a 2
		case 2 :
			//reinicia 'contador'
			contador = 0;
		break;
		
	}
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
