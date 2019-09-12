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

Formas b\u00e1sicas en Processing / line()

-Dibuja cuatro l\u00edneas o grupos de l\u00edneas

-line (x1, y1, x2, y2)

-Coordenadas de los extremos definidas a partir de un punto central

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

public void setup() {
	size(500, 150); //tama\u00f1o de la ventana. (ancho, alto)
	

}

public void draw() {
	background(0xff202020);
	//Ejemplo 1
	stroke(255);
	line(width*0.2f-20, height*0.5f-20, width*0.2f+20, height*0.5f+20);
	//Ejemplo 2
	line(width*0.4f-20, height*0.5f-20, width*0.4f+20, height*0.5f+20);
	line(width*0.4f+20, height*0.5f-20, width*0.4f-20, height*0.5f+20);
	//Ejemplo 3
	strokeWeight(4);
	line(width*0.6f-20, height*0.5f, width*0.6f+20, height*0.5f);
	line(width*0.6f, height*0.5f-20, width*0.6f, height*0.5f+20);
	//Ejemplo 4
	strokeWeight(1);
	line(
		width*0.8f+25*sin(frameCount*0.05f), 
		height*0.5f+25*cos(frameCount*0.05f), 
		width*0.8f-25*sin(frameCount*0.05f), 
		height*0.5f-25*cos(frameCount*0.05f)
		);
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
