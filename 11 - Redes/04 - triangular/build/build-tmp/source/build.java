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
int num = 20;
float gap, alto, lado;

//SETUP
public void setup() {
	size(400, 400);
	background(0xff202020);
	noFill();
	stroke(0xffffffff);
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

			
			triangulo(i*lado, ii*alto, (alto/3));
			triangulo(i*lado - lado/2, ii*alto - alto/2, (alto/3));

		}
	}

	noLoop();
}

public void triangulo(float x, float y, float radio){

	float correct = TWO_PI/12;

	//fill(random(50,127), 255, random(100,150));

	ellipse(x, y, radio*2, radio*2);

	/*

	triangle(
		x + cos(TWO_PI/3 + correct)*radio,
		y + sin(TWO_PI/3 + correct)*radio,
		x + cos(TWO_PI/3*2 + correct)*radio,
		y + sin(TWO_PI/3*2 + correct)*radio,
		x + cos(TWO_PI/3*3 + correct)*radio,
		y + sin(TWO_PI/3*3 + correct)*radio
	);

	//fill(random(127,200), 255, random(100,150));

	triangle(
		x + cos(TWO_PI/3 - correct)*radio,
		radio + y + sin(TWO_PI/3 - correct)*radio,
		x + cos(TWO_PI/3*2 - correct)*radio,
		radio + y + sin(TWO_PI/3*2 - correct)*radio,
		x + cos(TWO_PI/3*3 - correct)*radio,
		radio + y + sin(TWO_PI/3*3 - correct)*radio
	);

	*/
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
