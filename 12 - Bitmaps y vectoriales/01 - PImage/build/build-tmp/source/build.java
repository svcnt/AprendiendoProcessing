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

Aprendiendo Processing - PImage

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
	// le asignamos como valor la funci\u00f3n  loadimage(), que toma como par\u00e1metro la URL de la imagen
	img = loadImage("../../../data/img.jpg");
	// establecemos como ancho y alto de la ventana los de la imagen importada
	size(img.width, img.height);
	// cargamos la imagen en las coordenadas 0, 0
	image(img, 0, 0);
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
