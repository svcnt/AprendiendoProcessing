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

Aprendiendo Processing - while()

- Aumentar progresivamente el valor del giro y el tama\u00f1o del rect\u00e1ngulo

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
float rotation;
int i = 1;

//SETUP
public void setup() {
	size(400,400);
	background(0xff202020);
	stroke(255);
	fill(255,33);
	rectMode(CENTER);

	while (i < 400) {
		pushMatrix();
		translate(width*0.5f, height*0.5f);
		rotate(i);
		rect(0, 0, i, i, 25,5,25,5);
		popMatrix();
		i+=25;
	}
}

//LOOP
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
