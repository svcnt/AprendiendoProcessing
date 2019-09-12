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

Aprendiendo Processing - for()

- Mismo resultado que en 07 / Transformaciones - 04 usando un bucle

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

	rotation = sin(frameCount*0.05f)*HALF_PI;

	for (int i = 1; i < 15; ++i) {
		pushMatrix();
		translate(width*0.5f, height*0.5f);
		rotate(lerp (rotation/i, rotation, 1/i));
		rect(0, 0, 20*i, 20*i);
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
