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

Formas b\u00e1sicas en Processing / quad()

- Dibujar un tri\u00e1ngulo equil\u00e1tero 
definiendo la posici\u00f3n de sus v\u00e9rtices a partir del centro

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

int radio = 100;
float correct = TWO_PI/12;

public void setup() {
	size(400, 400); //tama\u00f1o de la ventana. (ancho, alto)
	noFill();
	stroke(255);

}

public void draw() {
	background(0xff202020);
	//Ejemplo 1: tri\u00e1ngulo equil\u00e1tero
	triangle(

		/* OPCI\u00d3N 1, basada en la relaci\u00f3n lado-altura
		
		width/2, //coords esquina 1
		height/2-radio,
		width/2+sqrt(radio*radio-radio/2*radio/2), //coords esquina 2
		height/2+radio/2,
		width/2-sqrt(radio*radio-radio/2*radio/2), //coords esquina 3
		height/2+radio/2
		
		*/

		/* OPCI\u00d3N 2, basada en divisi\u00f3n de la circunferencia */

		width/2 + cos(TWO_PI/3 + correct)*radio,
		height/2 + sin(TWO_PI/3 + correct)*radio,
		width/2 + cos(TWO_PI/3*2 + correct)*radio,
		height/2 + sin(TWO_PI/3*2 + correct)*radio,
		width/2 + cos(TWO_PI/3*3 + correct)*radio,
		height/2 + sin(TWO_PI/3*3 + correct)*radio
	);
	
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
