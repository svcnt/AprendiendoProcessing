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

Formas b\u00e1sicas en Processing / bezier()

- Dibuja una curva de Bezier
- Muestra los vectores de control como l\u00edneas grises

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

float p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y; //coordenadas de los puntos

public void setup() {
	size(450, 200); //tama\u00f1o de la ventana. (ancho, alto)
	noFill(); 

}

public void draw() {
	//Extremos
	p1x = 100;
	p1y = height/2;
	p4x = width-100;
	p4y = height/2;
	//Control
	p2x = 100+cos(frameCount*0.05f)*100;
	p2y = height/2+sin(frameCount*0.05f)*100;
	p3x = width-100+cos(frameCount*0.04f)*100;
	p3y = height/2+sin(frameCount*0.04f)*100;
	//color del fondo (HEX)
	background(0xff202020); 
	//Vectores control (gris)
	stroke(100);
	line(p1x, p1y, p2x, p2y);
	line(p4x, p4y, p3x, p3y);
	//Curva (blanco)
	stroke(255);
	bezier(p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y);
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
