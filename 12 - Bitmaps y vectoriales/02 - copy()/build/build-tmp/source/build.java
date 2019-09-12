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

Aprendiendo Processing - copy()

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
// declaramos una variable del tipo PImage de nombre 'img'
PImage img;

//SETUP
public void setup() {

	PImage img = loadImage("../../../data/img.jpg");
	size(400, 400);
	background(0);
	//copy toma estos 9 par\u00e1metros: 
	//nombre de la variable
	//coord. x e y de la esquina sup. izq. del recorte
	//anchura y altura del recorte
	//coord. x e y de la posici\u00f3n donde se inserta
	//ancho y alto del recuadro en el que se inserta
	copy(img, 150, 50, 200, 200, 10, 10, width-20, height-20);

}

//LOOP
public void draw() {
	
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
