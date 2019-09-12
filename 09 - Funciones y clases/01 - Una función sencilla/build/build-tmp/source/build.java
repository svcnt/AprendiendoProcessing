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

Aprendiendo Processing - funci\u00f3n sin par\u00e1metros

- La funci\u00f3n dibuja una flor
- Se invoca dos veces y se las sit\u00faa mediante translate()
- La segunda es sim\u00e9trica a la primera, empleando scale()

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES


//SETUP
public void setup() {
	size(500, 250);
	background(0xff202020);
	stroke(255);
	noFill();
	
}

//LOOP
public void draw() {
	pushMatrix();
		translate(width*0.25f, height*0.5f);
		flor();
	popMatrix();

	pushMatrix();
		translate(width*0.75f, height*0.5f);
		scale(-1, 1);
		flor();
	popMatrix();
}

public void flor(){
	float centroX = 0;
	float centroY = 0;
	float radio = sin(frameCount*0.05f) * 125;
	float posX = centroX+sin(frameCount*0.005f)*radio;
	float posY = centroY+cos(frameCount*0.005f)*radio;
	point(posX, posY);

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
