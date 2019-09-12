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

Aprendiendo Processing - scale();

- Dos grupos de cuadrados transformados con scale()

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
	size(400,200);
	background(0xff202020);
	noFill();
	stroke(255);
	rectMode(CENTER);
}

//LOOP
public void draw() {
	background(0xff202020);

	rotation = sin(frameCount*0.05f)*QUARTER_PI;

	//Primer grupo
	//Primer cuadrado
	rect(width/4, height/2, 100, 100);
	//Segundo cuadrado
	//80% menor
	scale(0.8f);
	rect(width/4, height/2, 100, 100);
	//Tercer cuadrado
	//60% menor
	scale(0.6f);
	rect(width/4, height/2, 100, 100);

	resetMatrix();

	//Segundo Grupo
	//Primer cuadrado
	pushMatrix();
		translate(width*0.75f, height/2);
		rect(0, 0, 100, 100);
	popMatrix();
	//Segundo cuadrado
	pushMatrix();
		translate(width*0.75f, height/2);
		scale(0.8f);
		rect(0, 0, 100, 100);
	popMatrix();
	//Tercer cuadrado
	pushMatrix();
		translate(width*0.75f, height/2);
		scale(0.6f);
		rect(0, 0, 100, 100);
	popMatrix();
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
