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

Aprendiendo Processing / Condicionales - if() anidados

- Si defines un condicional dentro de otro, 
el segundo no se eval\u00faa si la condici\u00f3n inicial no se cumple 

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
float ellipse1x, ellipse1y, ellipse2x, ellipse2y;
float distancia;

//SETUP
public void setup() {
	size(512, 512);
	background(0xff202020);
	noFill();
	//stroke(255,50);
}

//LOOP
public void draw() {
	fill(0xff202020, 5);
	//rect(-5, -5, width+10, height+10);

	ellipse1x = width/2 + sin(frameCount*0.05f)*sin(frameCount*0.005f)*250;
	ellipse1y = height/2 + cos(frameCount*0.05f)*sin(frameCount*0.005f)*250;

	ellipse2x = width/2 + sin(frameCount*-0.05f)*sin(frameCount*0.006f)*250;
	ellipse2y = height/2 + cos(frameCount*-0.05f)*sin(frameCount*0.007f)*250;

	distancia = dist(ellipse1x, ellipse1y, ellipse2x, ellipse2y);

	noStroke();

	

	if (distancia < 200) {
		stroke(255-distancia, 50);
		line(ellipse1x, ellipse1y, ellipse2x, ellipse2y);
		if (distancia < 100) {
			ellipse(ellipse1x, ellipse1y, 5, 5);
			ellipse(ellipse2x, ellipse2y, 5, 5);
			if (distancia < 25) {
				ellipse(ellipse1x, ellipse1y, 15, 15);
				ellipse(ellipse2x, ellipse2y, 15, 15);

			} 
		}

	} else {
		//stroke(255);
		strokeWeight(1);
		noStroke();
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
