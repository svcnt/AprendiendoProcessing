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

Aprendiendo Processing / Condicionales - if()

- Ver comentarios en el c\u00f3digo

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
float ellipse1x, ellipse1y, ellipse2x, ellipse2y;

//SETUP
public void setup() {
	size(512, 512);
	//background(#202020);
	noFill();
	stroke(255);
}

//LOOP
public void draw() {
	fill(0xff202020, 10);
	//fondo transparente
	rect(-5, -5, width+10, height+10);

	ellipse1x = width/2 + sin(frameCount*0.06f)*sin(frameCount*0.009f)*250;
	ellipse1y = height/2 + cos(frameCount*0.06f)*sin(frameCount*0.009f)*250;

	ellipse2x = width/2 + sin(frameCount*-0.05f)*sin(frameCount*0.0005f)*225;
	ellipse2y = height/2 + cos(frameCount*-0.05f)*sin(frameCount*0.0005f)*225;

	ellipse(ellipse1x, ellipse1y, 5, 5);
	ellipse(ellipse2x, ellipse2y, 5, 5);

	//Si la distancia entre los centros de las circ es menor que 150
	if (dist(ellipse1x, ellipse1y, ellipse2x, ellipse2y) < 150) {
		//color de l\u00ednea: azul
		stroke(0xff0000ff);
		//l\u00edea entre ambos centros
		line(ellipse1x, ellipse1y, ellipse2x, ellipse2y);
	//Si por el contrario la distancia es mayor que 250
	} else if (dist(ellipse1x, ellipse1y, ellipse2x, ellipse2y) > 250) {
		//aumenta el grosor de l\u00ednea
		strokeWeight(5);
	//Si no se da ninguno de esos casos	
	} else {
		//deja la l\u00ednea como estaba
		stroke(255);
		strokeWeight(1);
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
