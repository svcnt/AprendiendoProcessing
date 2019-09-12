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

Aprendiendo Processing - pushMatrix() y popMatrix();

- 6 cuadrados que giran

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
float rotation;

//SETUP
public void setup() {
	size(400,400);
	background(0xff202020);
	noFill();
	stroke(255);
	rectMode(CENTER);
}

//LOOP
public void draw() {
	background(0xff202020);
	fill(255,33);

	rotation = sin(frameCount*0.05f)*QUARTER_PI;

	//Primera fila
	//Primer cuadrado
	pushMatrix();
	translate(width*0.25f, height*0.33f);
	rotate(frameCount*0.05f);
	rect(0, 0, 100, 100);
	popMatrix();
	//Segundo cuadrado
	pushMatrix();
	translate(width*0.5f, height*0.33f);
	rotate(frameCount*0.05f);
	rect(0, 0, 100, 100);
	popMatrix();
	//Tercer cuadrado
	pushMatrix();
	translate(width*0.75f, height*0.33f);
	rotate(frameCount*0.05f);
	rect(0, 0, 100, 100);
	popMatrix();

	//Segunda fila
	//Consigue el mismo resultado que en la primera fila empleando un bucle
	//Ver carpeta 08 - Condicionales y bucles
	for (int i = 1; i < 4; ++i) {
		pushMatrix();
		translate(width*(0.25f*i), height*0.66f);
		rotate(frameCount*0.05f);
		rect(0, 0, 100, 100);
		popMatrix();
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
