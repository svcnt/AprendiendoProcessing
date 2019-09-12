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

Formas b\u00e1sicas en Processing / createShape()

- Dibujar un pol\u00edgono regular

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/
//VARIABLES
//Crear objeto PShape
PShape poli;
//N\u00famero de lados
int lados = 7;
//radio de la cc
int radio = 100;
//coordenadas
float x = 100;
float y = 100;


public void setup() {
	size(400, 400, P2D); //tama\u00f1o de la ventana. (ancho, alto)
	background(0xff202020);
	fill(255,50);
	stroke(255);

	poli = createShape();
	poli.beginShape();
	for (int i = 0; i < lados; ++i) {
		poli.vertex(x-sin(TWO_PI/lados*i)*radio , y-cos(TWO_PI/lados*i)*radio);
	}
	
	poli.endShape(CLOSE);

	shape (poli, x, y);
	
}

public void draw() {

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
