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

Formas b\u00e1sicas en Processing / arc()



Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

public void setup() {
	size(400, 400); //tama\u00f1o de la ventana. (ancho, alto)
	

}

public void draw() {
	background(0xff202020);
	//Fila superior
	//Ejemplo 1
	//Arco simple
	stroke(255);
	strokeWeight(1);
	noFill();
	arc(width*0.25f, height*0.25f , 75, 75, 0, PI); //coord x, coord y, ancho, alto, inicio, fin
	//Ejemplo 2
	//Varios arcos de diferentes grosores encadenados
	arc(width*0.5f, height*0.25f, 75, 75, 0, HALF_PI);
	strokeWeight(2);
	arc(width*0.5f, height*0.25f, 75, 75, HALF_PI, PI);
	strokeWeight(4);
	arc(width*0.5f, height*0.25f, 75, 75, PI, PI+QUARTER_PI);
	//Ejemplo 3
	//Arco de \u00e1ngulo variable
	strokeWeight(1);
	arc(width*0.75f, height*0.25f, 75, 75, 0, PI+sin(frameCount*0.05f)*PI);
	//Fila media
	//Ejemplo 4
	//Arco con inicio y fin variables (mismo \u00e1ngulo)
	strokeWeight(1);
	arc(width*0.25f, height*0.5f, 75, 75, HALF_PI+sin(frameCount*0.05f)*PI, PI+sin(frameCount*0.05f)*PI);
	//Ejemplo 5
	//Arco con cuerda
	strokeWeight(1);
	arc(width*0.5f, height*0.5f, 75, 75, 0, PI+sin(frameCount*0.05f)*PI, CHORD);
	//Ejemplo 6
	//Sector
	strokeWeight(1);
	arc(width*0.75f, height*0.5f, 75, 75, 0, PI+sin(frameCount*0.05f)*PI, PIE);
	//Ejemplo 7
	//Arcos el\u00edpticos girando
	strokeWeight(1);
	arc(width*0.5f, height*0.75f, 200, 75, frameCount*0.05f, frameCount*0.05f+TWO_PI/3);
	arc(width*0.5f, height*0.75f, 195, 70, frameCount*0.06f, frameCount*0.06f+TWO_PI/3);
	arc(width*0.5f, height*0.75f, 190, 65, frameCount*0.07f, frameCount*0.07f+TWO_PI/3);

	
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
