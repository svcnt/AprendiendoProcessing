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

Aprendiendo Processing - translate()

- Tres cuadrados creados en las coordenadas 0, 0 
- Trasladados a diferentes posiciones

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES

//SETUP
public void setup() {
	size(400,200);
	background(0xff202020);
	noFill();
	//definir rect a partir de su centro
	rectMode(CENTER);
}

//LOOP
public void draw() {

	//Primer vector
	stroke(0xffFFFF00);
	line(0, 0, width*0.25f, height*0.5f);
	ellipse(width*0.25f, height*0.5f, 10, 10);
	//Primer cuadrado
	stroke(255);
	translate(width*0.25f, height*0.5f);
	rect(0, 0, 75, 75);

	//Segundo vector
	stroke(0xff00FFFF);
	line(0, 0, width*0.25f, 0);
	ellipse(width*0.25f, 0, 10, 10);
	//Segundo cuadrado
	stroke(255);
	translate(width*0.25f, 0);
	rect(0, 0, 75, 75);

	//Tercer vector
	stroke(0xffFF00FF);
	line(0, 0, width*0.25f, 0);
	ellipse(width*0.25f, 0, 10, 10);
	//Tercer cuadrado
	stroke(255);
	translate(width*0.25f, 0);
	rect(0, 0, 75, 75);

	

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
