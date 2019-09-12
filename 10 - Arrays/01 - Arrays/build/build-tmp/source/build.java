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

Aprendiendo Processing - Arrays

- Un array es una secuencia de valores para un tipo de variable

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
int num = 10;
int radio;
PShape poli;
//array de n\u00fameros enteros de nombre 'num_lados'
//almacena los valores 3, 6 y 9, en ese orden
//se accede a los valores indicando el n\u00famero de orden, comenzando por 0
//ej: num_lados[0] devuelve '3'
int[] num_lados = {3, 6, 12};

//SETUP
public void setup() {
	size(512, 512, P2D);
	background(0xff202020);
	stroke(255);
	fill(255,50);
	smooth();

	radio = (width/num)/2;
	
}

//LOOP
public void draw() {

	for (int i = 1; i < num; ++i) {
		for (int ii = 1; ii < num; ++ii) {
			float gap = width/num;
			point(i*gap, ii*gap);
			poli(num_lados[PApplet.parseInt(random(0,3))], i*gap, ii*gap);
		}
		
	}

	noLoop();
	
}

//dibuja un pol\u00edgono regular 
//param: n\u00famero de lados, coordenadas del centro
public void poli(int lados, float x, float y){

	poli = createShape();
	poli.beginShape();
	for (int i = 0; i < lados; ++i) {
		poli.vertex(-sin(TWO_PI/lados*i)*radio , -cos(TWO_PI/lados*i)*radio);
	}
	
	poli.endShape(CLOSE);

	shape (poli, x, y);
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
