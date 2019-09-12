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

Aprendiendo Processing / shear()

- Estirar un conjunto de dos rect\u00e1ngulos que forman una X

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
	noStroke();
	fill(255);
	rectMode(CENTER);
}

//LOOP
public void draw() {
	background(0xff202020);
	
	//aplica dos transformaciones al conjunto
	translate(width/2, height/2);
	shearY(sin(frameCount*0.05f)*QUARTER_PI/2);
	shearX(cos(frameCount*0.05f)*QUARTER_PI/2);

	//estira el primer rect
	pushMatrix();
	shearX(QUARTER_PI);
	rect(0, 0, 20, 200);
	popMatrix();

	//estira el segundo
	pushMatrix();
	//translate(width/2, height/2);
	shearX(-QUARTER_PI);
	rect(0, 0, 20, 200);
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
