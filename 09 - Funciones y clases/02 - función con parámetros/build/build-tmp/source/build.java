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

Aprendiendo Processing - funci\u00f3n con par\u00e1metros

- Como 01, pero la posici\u00f3n y la simetr\u00eda se les asigna como par\u00e1metros de la funci\u00f3n flor()

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

		flor(width*0.25f, height*0.5f, 1);
		flor(width*0.75f, height*0.5f, -1);

}

public void flor(float centroX, float centroY, float sim){
	pushMatrix();
		translate(centroX, centroY);
		float radio = sin(frameCount*0.05f) * 125;
		float posX = sim*sin(frameCount*0.005f)*radio;
		float posY = cos(frameCount*0.005f)*radio;
		point(posX, posY);
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
