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

Aprendiendo Processing - Red triangular

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
int num = 15;
float gap, alto, lado;
PShape hex;

//SETUP
public void setup() {
	size(400, 400, P2D);
	background(0xff202020);
	noFill();
	stroke(0xff202020);
	smooth();
	colorMode(HSB);
}

//LOOP
public void draw() {

	translate((width/num)/3 , 0);

	for (int i = 1; i < num; ++i) {
		for (int ii = 1; ii < num; ++ii) {
			gap = width/num;
			lado = gap;
			alto = sqrt(3)*gap;

			
			tesela(i*lado, ii*alto, (alto/3));
			tesela(i*lado - lado/2, ii*alto - alto/2, (alto/3));

		}
	}

	noLoop();
}

public void tesela(float x, float y, float radio){

	float correct = TWO_PI/12;
	float hue = random(map(x*y, 0, 160000, 0, 255));
	float sat = 127;
	float bri = random(50, 200);
	fill(hue, sat, bri);

	hex = createShape();
	hex.beginShape();
	hex.vertex(-sin(TWO_PI/6)*radio , -cos(TWO_PI/6)*radio);
	hex.vertex(-sin(TWO_PI/6*2)*radio , -cos(TWO_PI/6*2)*radio);
	hex.vertex(-sin(TWO_PI/6*3)*radio , -cos(TWO_PI/6*3)*radio);
	hex.vertex(-sin(TWO_PI/6*4)*radio , -cos(TWO_PI/6*4)*radio);
	hex.vertex(-sin(TWO_PI/6*5)*radio , -cos(TWO_PI/6*5)*radio);
	hex.vertex(-sin(TWO_PI/6*6)*radio , -cos(TWO_PI/6*6)*radio);
	hex.endShape(CLOSE);

	shape(hex, x, y);
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
