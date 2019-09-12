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

Aprendiendo Processing - rotate();

- Tres cuadrados girando alrededor de 0, 0

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES

//SETUP
public void setup() {
	size(400,400);
	background(0xff202020);
	noFill();
	stroke(255);
	rectMode(CENTER);
	smooth();
}

//LOOP
public void draw() {
	background(0xff202020);
	rotate(sin(frameCount*0.05f)*0.1f);
	rect(width*0.25f, height*0.5f, 75, 75);
	rotate(sin(frameCount*0.05f)*0.1f);
	rect(width*0.5f, height*0.5f, 75, 75);
	rotate(sin(frameCount*0.05f)*0.1f);
	rect(width*0.75f, height*0.5f, 75, 75);
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
