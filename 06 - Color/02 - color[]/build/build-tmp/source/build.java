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

Aprendiendo Processing - color[]

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

float x = 0;
//array de colores
//ver carpeta 10 - Arrays
int[] paleta = { 0xffC74029, 0xffFAE8CD, 0xff128085, 0xff385052, 0xffF0AD44};

public void setup(){
	size(500, 500);
	rectMode(CENTER);
	smooth();
	noStroke();
	background(paleta[1]);
}

public void draw(){
	//mientras x e y est\u00e9n dentro de la ventana
	while (x<width) {
	  float y=0;
	  while (y<height) {
	  	//ancho y alto aleatorio para cada rect
	    float w=random(5, 25);
	    float h=random(5, 25);
	    //sombra
	    fill(50, 50);
	    rect(x+12, y+12, w, h);
	    //color tomado de la paleta
	    fill(paleta[PApplet.parseInt(random (5))]);
	    rect(x+10, y+10, w, h);
	    y+=15; //sumar 15 a x
	  }
	  x+=15; //sumar 15 a y
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
