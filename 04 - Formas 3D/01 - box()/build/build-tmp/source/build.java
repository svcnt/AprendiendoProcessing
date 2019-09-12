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

Aprendiendo Processing - box()



Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES

//SETUP
public void setup() {
	size(512, 512, P3D);
	stroke(255);
	fill(0xff202020);
}

//LOOP
public void draw() {
	//luces por defecto
	lights();
	background(0xff202020);
	//Fila 1
	//Ejemplo 1
	//Cubo que se desplaza
	pushMatrix();
	translate(map(sin(frameCount*0.05f), -1, 1, width*0.25f,  width*0.75f), height*0.25f, 0);
	box(100);
	popMatrix();
	//Fila 2
	//Paralelep\u00edpedos que giran en torno a sus ejes X, Y, Z
	//Ejemplo 4
	pushMatrix();
	translate(width*0.25f, height*0.5f, 0);
	rotateX(frameCount*0.05f);
	box(100,100,25);
	popMatrix();
	//Ejemplo 5
	pushMatrix();
	translate(width*0.5f, height*0.5f, 0);
	rotateY(frameCount*0.05f);
	box(100,100,25);
	popMatrix();
	//Ejemplo 6
	pushMatrix();
	translate(width*0.75f, height*0.5f, 0);
	rotateZ(frameCount*0.05f);
	box(100,100,25);
	popMatrix();
	//Flia 3
	//Cubo que gira alrededor de sus tres ejes y se desplaza en una elipse en los ejes X-Z
	//Ejemplo 7
	pushMatrix();
	translate(
		map(sin(frameCount*0.04f), -1, 1, width*0.25f,  width*0.75f), 
		height*0.75f, 
		map(cos(frameCount*0.04f), -1, 1, 50,  -200)
		);
	rotateX(frameCount*0.05f);
	rotateY(frameCount*0.06f);
	rotateZ(frameCount*0.07f);
	box(100);
	popMatrix();

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
