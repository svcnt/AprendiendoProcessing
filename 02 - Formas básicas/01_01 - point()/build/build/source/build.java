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

Formas b\u00e1sicas en Processing / point()

- Dibuja varios grupos de puntos

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

public void setup() {
	 //tama\u00f1o de la ventana. (ancho, alto)


}

public void draw() {
	background(0xff202020); //color del fondo (HEX)
	//Ejemplo 1
	//Punto blanco opaco
	stroke(255); //color de la l\u00ednea (int >=0 <=255)
	strokeWeight(5); //grosor de la l\u00ednea (p\u00edxeles)
	point(width*0.2f, height/2); //punto (coordenada x, coordenada y)
	//Punto 2
	//Varios puntos transparentes de diferente grosor
	stroke(255,25); //color de la l\u00ednea (int >=0 <=255, transparencia)
	strokeWeight(25);
	point(width*0.4f, height/2);
	strokeWeight(20);
	point(width*0.4f, height/2);
	strokeWeight(15);
	point(width*0.4f, height/2);
	strokeWeight(10);
	point(width*0.4f, height/2);
	//Punto 3
	//Puntos transparentes de diferentes colores
	strokeWeight(60);
	stroke(0xffff0000,50);
	point(width*0.6f-20, height/2-10);
	stroke(0xff00ff00,50);
	point(width*0.6f+20, height/2-10);
	stroke(0xff0000ff,50);
	point(width*0.6f, height/2+20);
	//Punto 4
	//Un punto gira alrededor de otro
	//La posici\u00f3n del punto en movimiento se calcula
	//mediante el seno (sin()) y coseno (cos())
	//de un \u00e1ngulo variable (frameCount)
	stroke(255);
	strokeWeight(50);
	point(width*0.8f, height/2);
	strokeWeight(5);
	point(width*0.8f+50*sin(frameCount*0.05f), height/2+50*cos(frameCount*0.05f));

}
  public void settings() { 	size(450, 150); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "build" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
