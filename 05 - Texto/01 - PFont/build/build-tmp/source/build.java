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

Aprendiendo Processing - PFont

- Texto

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES

//SETUP
public void setup() {
	size(400, 400);
	background(0xff202020);
	noStroke();
	fill(255);
	smooth();

	//crea obj PFont
	PFont miFuente;
	//Archivo fuente .vlw en carpera 'data'.
	//Desde la IDE, clic en Tools / Create font ...
	//para crear e importar el archivo fuete
	miFuente = loadFont("ACaslonPro-SemiboldItalic-48.vlw");
	//definir fuente y tama\u00f1o
	textFont(miFuente, 48);
	//texto
	text("Processing", width/2, height*0.25f);
	//alineaci\u00f3n
	textAlign(CENTER, BOTTOM); // CENTER, LEFT, RIGHT, BOTTOM, CENTER, TOP
	//texto 2
	text("Processing", width/2, height*0.5f);
	
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
