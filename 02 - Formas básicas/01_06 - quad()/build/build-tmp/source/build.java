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

Formas b\u00e1sicas en Processing / quad()

- Cuadril\u00e1tero con v\u00e9rtices m\u00f3viles

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

public void setup() {
	size(400, 400); //tama\u00f1o de la ventana. (ancho, alto)
	noFill();
	stroke(255);

}

public void draw() {
	background(0xff202020);
	//Ejemplo 1
	quad(
			25+sin(frameCount*0.05f)*25, //esquina 1 x
			25+sin(frameCount*0.06f)*25, //esquina 1 y
			width-25+sin(frameCount*0.06f)*25, //esquina 2 x
			25+sin(frameCount*0.07f)*25, //esquina 2 y
			width-25+sin(frameCount*0.08f)*25, //esquina 3 x
			height-25+sin(frameCount*0.06f)*25, //esquina 3 y
			25+sin(frameCount*0.05f)*25, //esquina 4 x
			height-25+sin(frameCount*0.04f)*25 //esquina 4 y

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
