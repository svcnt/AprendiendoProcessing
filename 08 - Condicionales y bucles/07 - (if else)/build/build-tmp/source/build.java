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

Aprendiendo Processing - ?:

- Modificar el color de la l\u00ednea si es par 

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
int a, b;

//SETUP
public void setup() {
	size(400,400);
	background(0xff202020);
	noStroke();
	fill(255,33);
}

//LOOP
public void draw() {

	for (int i = 0; i < 40; ++i) {
		b = i % 2;
		//eval\u00faa la condici\u00f3n
		//si se cumple, asigna el valor 125 a la variable
		//si no se cumple, le asigna valor 255
		a = (b == 1)? 125 : 255;
		fill(a);
		rect(i*10, 0, 1, height);
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
