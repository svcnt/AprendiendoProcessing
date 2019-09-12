import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import processing.video.*; 

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

Aprendiendo Processing - Movie

- Clic para parar, soltar para continuar

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//LIBRER\u00cdAS

//VARIABLES
//crear obj Movie
Movie clip01;


public void setup() {
  size(480, 360);
  background(0xff202020);
  //cargar v\u00eddeo
  clip01 = new Movie(this, "../../../../data/clip.mp4");
  //reiniciar al acabar
  clip01.loop();
  //reproducir una vez
  //clip01.play();
  clip01.speed(1);
  clip01.frameRate(24);
}

public void draw() {
  //tint(255, 20);
  //video, coords, tama\u00f1o
  image(clip01, 0, 0, width, height);
  text(clip01.time(), 20, 20);
}

// refrescar
public void movieEvent(Movie m) {
  m.read();
}

public void mousePressed() {
  clip01.pause();
}

public void mouseReleased() {
  clip01.play();
  println(clip01.duration());
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
