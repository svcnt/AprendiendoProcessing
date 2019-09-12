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

Aprendiendo Processing - sphere()

- Dibuja varias esferas
- N\u00famero de facetas determinado por p\u00f2sici\u00f3n del mouse

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
	
	smooth();
}

//LOOP
public void draw() {
	//lights();
	background(0xff202020);
	sphereDetail(mouseX / 10, mouseY / 10);
	//Fila 1
	//Ejemplo 1
	//Esfera que se desplaza
	pushMatrix();
	translate(map(sin(frameCount*0.05f), -1, 1, width*0.25f,  width*0.75f), height*0.25f, 0);
	sphere(50);
	popMatrix();
	//Fila 2
	//Esferas que giran en torno a sus ejes X, Y, Z
	//Ejemplo 2
	pushMatrix();
	fill(0xff00FFFF);
	stroke(0xff202020);
	translate(width*0.25f, height*0.5f, 0);
	rotateX(frameCount*0.01f);
	sphere(50);
	popMatrix();
	//Ejemplo 3
	fill(0xffFF00FF);
	stroke(0xff202020);
	pushMatrix();
	translate(width*0.5f, height*0.5f, 0);
	rotateY(frameCount*0.01f);
	sphere(50);
	popMatrix();
	//Ejemplo 4
	fill(0xffFFFF00);
	stroke(0xff202020);
	pushMatrix();
	translate(width*0.75f, height*0.5f, 0);
	rotateZ(frameCount*0.01f);
	sphere(50);
	popMatrix();
	//Flia 3
	//Esfera que gira alrededor de sus tres ejes y se desplaza en una elipse en los ejes X-Z
	//Ejemplo 5
	fill(0xff202020);
	stroke(255);
	pushMatrix();
	translate(
		map(sin(frameCount*0.04f), -1, 1, width*0.25f,  width*0.75f), 
		height*0.75f, 
		map(cos(frameCount*0.04f), -1, 1, 50,  -200)
		);
	rotateX(frameCount*0.05f);
	rotateY(frameCount*0.06f);
	rotateZ(frameCount*0.07f);
	sphere(50);
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
