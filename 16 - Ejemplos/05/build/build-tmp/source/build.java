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

Aprendiendo Processing - Ejemplo 05

- Visualizar un campo noise()
1.- Lanzamos una serie de segmentos sobre la ventana
2.- Hacemos que su direcci\u00f3n oscile seg\u00fan la posici\u00f3n de sus coordenadas en un campo noise()

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//LIBRER\u00cdAS
//VARIABLES GLOBALES
//n: posiciones en el campo noise()
//vel: velocidad a la que nos movemos en el eje Z
float n, vel; 
float zoom = 0.0025f;
//lg: longitud de los segmentos
int lg = 25;
//dist: distancia entre or\u00edgenes de los segmentos
int dist = 5;


public void setup() {
  size(800, 400);
  background(0xff202020);
  noFill();
}

public void draw(){
	background(0xff202020);
	vel = frameCount*0.005f;
	for (int i = 0; i < width; i+=dist) {
		for (int ii = 0; ii < height; ii+=dist) {
			//posiciones x, y, z de cada punto en el campo noise()
			n = noise(i*zoom, ii*zoom, vel)*TWO_PI;
			stroke(255, 60);
			line(i, ii, i+sin(n)*lg, ii+cos(n)*lg);
		}
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
