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

- Clic para cambiar el patr\u00f3n

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//VARIABLES GLOBALES
int contador = 0;

float h = 0;
float s = 0;
float b = 0;

public void setup() {

  size(500, 400);
  colorMode(HSB);

}

     
public void draw() {

  loadPixels();

  for (int i = 0; i < pixels.length; i++) {
    //el valor de cada variable es menor al principio y mayor al final

    switch(contador){
      default:
        h = PApplet.parseInt(random(i/500));
        s = PApplet.parseInt(random(i/500));
        b = PApplet.parseInt(random(i/500));
        pixels[i] = color(h, s, b);
      break;

      case 1:
        h = PApplet.parseInt(sin(frameCount*0.5f*i)*255);
        s = PApplet.parseInt(sin(frameCount*0.4f*i)*255);
        b = PApplet.parseInt(sin(frameCount*0.3f*i)*255);
        pixels[i] = color(h, s, b);
      break;

       case 2:
        contador = 0;
      break;


    }
    

  }

  updatePixels();

}

public void mouseReleased() {
  contador++;
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
