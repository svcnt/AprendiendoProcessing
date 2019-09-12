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

Formas b\u00e1sicas en Processing / rect()

- Dibuja 4 rect\u00e1ngulos con diferentes propiedades

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

public void setup() {
	size(400, 150); //tama\u00f1o de la ventana. (ancho, alto)
	//Punto de anclaje del rect\u00e1ngulo:
	//CENTER, CORNER (por defecto)
	rectMode(CENTER); 

}

public void draw() {
	background(0xff202020);
	//Ejemplo 1
	//Cuadrado de 75x75
	stroke(255);
	strokeWeight(1);
	noFill();
	rect(width*0.20f, height/2, 75, 75); //Rect\u00e1ngulo (coord x, coord y, ancho, alto)
	//Ejemplo 2
	//Cuadrado con esquinas redondeadas
	rect(width*0.40f, height/2, 75, 75, 10); //Rect\u00e1ngulo (coord x, coord y, ancho, alto, redondeado uniforme)
	//Ejemplo 3
	//Cuadrado con diferentes redondeados
	rect(width*0.60f, height/2, 75, 75, 10, 15, 20, 25); //Rect\u00e1ngulo (coord x, coord y, ancho, alto, redondeado de cada esquina)
	//Ejemplo 4
	//Redondeados variables positivos y negativos 
	rect(width*0.80f, height/2, 75, 75, sin(frameCount*0.05f)*25, sin(frameCount*0.06f)*25, sin(frameCount*0.07f)*25, sin(frameCount*0.08f)*25);
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
