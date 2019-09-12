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

Formas b\u00e1sicas en Processing / ellipse()

-Dibuja varias circunferencias o grupos de circunferencias

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
	//Ejemplo 1
	//Circunferencia sin relleno
	stroke(255); //color de l\u00ednea
	strokeWeight(1); //grosor de l\u00ednea
	noFill(); //sin relleno
	ellipse(width*0.25f, height*0.25f, 100, 100);
	//Ejemplo 2
	//l\u00ednea y relleno semitransparentes, con colores distintos
	stroke(0xff00FFFF,50); //color de l\u00ednea, transparencia
	strokeWeight(8);
	fill(255,50);
	ellipse(width*0.75f, height*0.25f, 100, 100);
	//Ejemplo 3
	stroke(255,50);
	strokeWeight(1);
	noFill();
	//Elipse
	ellipse(width*0.25f, height*0.75f, 150, 75);
	fill(255);
	//Circunferencia peque\u00f1a que gira
	ellipse(width*0.25f+75*sin(frameCount*0.05f), height*0.75f+37.5f*cos(frameCount*0.05f), 4, 4);
	//Ejemplo 4
	//Circunferencia de altura variable
	//aparentememte gira en el eje X
	stroke(255);
	strokeWeight(1);
	noFill();
	ellipse(width*0.75f, height*0.75f, 100, 100*sin(frameCount*0.05f));
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
