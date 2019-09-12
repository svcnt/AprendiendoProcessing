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

Aprendiendo Processing - pixels[]

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//importamos una imagen

PImage img;
float bri;


public void setup() {
  img = loadImage("../../../data/img.jpg");
  size(img.width, img.height);
  image(img, 0, 0);
  //cargamos todos sus p\u00edxeles
  loadPixels();
}

public void draw() {
  for (int i = 0; i < pixels.length; i++) {
    //leemos el valor de los canales rojo, verde y azul de cada uno
    float bri_ = brightness(pixels[i]);
    if (bri_ < 127) {
      bri = 0;
    } else { bri = 255;}
    //asignamos esos mismos valores a cada p\u00edxel
    pixels[i] = color(bri);
    //actualizamos
    updatePixels();
  }
  
  noLoop();
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
