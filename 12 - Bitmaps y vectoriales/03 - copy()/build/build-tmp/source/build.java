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

Aprendiendo Processing - copy()

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


    PImage img;

    int x = 150;

    int y = 75;

    int tam = 200;

     

    public void setup() {

      size(300, 300);

      background(0);

    }

     

    public void draw() {

      img = loadImage("../../../data/img.jpg");

      //los cuatro primeros datos est\u00e1n controlados por variables

      copy(img, x, y, tam, tam, 10, 10, width-20, height-20);

      x = x+PApplet.parseInt(random(-1, 1)*2);

      y = y+PApplet.parseInt(random(-1, 1)*2);

      tam = tam+PApplet.parseInt(random(-1, 1)*2);

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
