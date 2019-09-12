import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import peasy.*; 

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

//LIBRER\u00cdAS
//importar librer\u00eda

//crear objeto c\u00e1mara 
PeasyCam cam;


//VARIABLES GLOBALES

//SETUP
public void setup() {
	size(512, 512, P3D);
	stroke(0xff202020,25);
	fill(0xffffffff);
	
	smooth();

	//Param: (this, \u00e1ngulo lente)
	cam = new PeasyCam(this,100);
	//distancias m\u00ednima y m\u00e1xima con scroll
	cam.setMinimumDistance(100);
	cam.setMaximumDistance(250);
}

//LOOP
public void draw() {
	lights();
	background(0xff202020);

	//Sol 
	pushMatrix();
	rotateY(frameCount*0.005f);
	sphere(25);
	popMatrix();

	//Planeta
	rotate(frameCount*0.05f);
	pushMatrix();
	translate(50,0,0);
	sphere(5);
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
