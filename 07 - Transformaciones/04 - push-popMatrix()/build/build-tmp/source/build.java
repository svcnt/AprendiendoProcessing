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

Aprendiendo Processing - pushMatrix() y popMatrix()

- Cuadrados que oscilan en torno al centro de la ventana

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
float rotation;

//SETUP
public void setup() {
	size(400,400);
	background(0xff202020);
	noFill();
	stroke(255);
	rectMode(CENTER);
}

//LOOP
public void draw() {
	background(0xff202020);
	fill(255,33);

	//giro del primer cuadrado
	rotation = sin(frameCount*0.05f)*QUARTER_PI;
	//Primera fila
	//Primer cuadrado
	pushMatrix(); //guarda la matriz de coordenadas de la ventana
	translate(width*0.5f, height*0.5f);
	rotate(rotation);
	rect(0, 0, 100, 100);
	popMatrix(); //reestablece la matriz de coordenadas
	//Segundo cuadrado
	pushMatrix();
	translate(width*0.5f, height*0.5f);
	rotate(lerp (rotation*0.75f, rotation, 0.1f)); 
	//lerp() calcula un valor situado en un promedio entre otros dos valores
	//param: primer valor, segundo valor, factor del promedio entre ambos (entre 0 y 1)
	rect(0, 0, 150, 150);
	popMatrix();
	//Tercer cuadrado
	pushMatrix();
	translate(width*0.5f, height*0.5f);
	rotate(lerp (rotation*0.5f, rotation*0.75f, 0.1f));
	rect(0, 0, 200, 200);
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
