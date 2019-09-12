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

Aprendiendo Processing - color()

- Tres circ. transparentes de colores b\u00e1sicos RGB 

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/
//VARIABLES
int rojo = color(100, 0, 0);
int verde = color(0, 100, 0);
int azul = color(0, 0, 100);

//SETUP
public void setup() {
	size(400, 400, P2D); //tama\u00f1o de la ventana. (ancho, alto)
	background(255);

	float x = width/2;
	float y = width/2;
	int diam = 200;
	int radio = 50;

	//modo de color y rango de valores
	colorMode(HSB, 100);

	stroke(0xff202020);

	fill(rojo, 50);
	ellipse (x+sin(TWO_PI/3)*radio, y+cos(TWO_PI/3)*radio, diam, diam);
	fill(verde, 50);
	ellipse (x+sin(TWO_PI/3*2)*radio, y+cos(TWO_PI/3*2)*radio, diam, diam);
	fill(azul, 50);
	ellipse (x+sin(TWO_PI/3*3)*radio, y+cos(TWO_PI/3*3)*radio, diam, diam);

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
