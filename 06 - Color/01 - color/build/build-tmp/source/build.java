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

Aprendiendo Processing - color 

background() //color de fondo (int, hex, color)
colorMode() //modo (RGB (defecto), HSB)
fill() //relleno (color, alfa)
noFill() //sin relleno
noStroke() //sin l\u00ednea
stroke() //color de l\u00ednea (color, alfa)

- Dibujar un pent\u00e1gono regular y un hex\u00e1gono
- Colores aleatorios

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/
//VARIABLES
PShape pent, hex;


public void setup() {
	size(400, 400, P2D); //tama\u00f1o de la ventana. (ancho, alto)
	background(0xff202020);
	//modo de color
	colorMode(HSB);
	
	//variables tono, saturaci\u00f3n y brillo
	float hue, sat, bri;
	hue = random(255); //aleatorio
	sat = random(50,200); //aleatorio, valores restringidos
	bri = 200; //valor constante

	fill(hue, sat, bri, 50);
	stroke(255);

	//coordenadas
	float x = width/2;
	float y = width/2;
	//radio de la circunferencia circunscrita al pol\u00edgono
	int radio = 100;
	int radio2 = 150;

	pent = createShape();
	pent.beginShape();
	pent.vertex(-sin(TWO_PI/5)*radio , -cos(TWO_PI/5)*radio);
	pent.vertex(-sin(TWO_PI/5*2)*radio , -cos(TWO_PI/5*2)*radio);
	pent.vertex(-sin(TWO_PI/5*3)*radio , -cos(TWO_PI/5*3)*radio);
	pent.vertex(-sin(TWO_PI/5*4)*radio , -cos(TWO_PI/5*4)*radio);
	pent.vertex(-sin(TWO_PI/5*5)*radio , -cos(TWO_PI/5*5)*radio);
	pent.endShape(CLOSE);

	hex = createShape();
	hex.beginShape();
	hex.vertex(-sin(TWO_PI/6)*radio2 , -cos(TWO_PI/6)*radio2);
	hex.vertex(-sin(TWO_PI/6*2)*radio2 , -cos(TWO_PI/6*2)*radio2);
	hex.vertex(-sin(TWO_PI/6*3)*radio2 , -cos(TWO_PI/6*3)*radio2);
	hex.vertex(-sin(TWO_PI/6*4)*radio2 , -cos(TWO_PI/6*4)*radio2);
	hex.vertex(-sin(TWO_PI/6*5)*radio2 , -cos(TWO_PI/6*5)*radio2);
	hex.vertex(-sin(TWO_PI/6*6)*radio2 , -cos(TWO_PI/6*6)*radio2);
	hex.endShape(CLOSE);

	shape (pent, x, y);
	shape (hex, x, y);

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
