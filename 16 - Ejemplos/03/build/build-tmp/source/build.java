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

Aprendiendo Processing - Ejemplo 01

- Carga una imagen y dibuja una nube de puntos aleatorios que toman el color de ella

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
//n\u00famero de puntos
int cantidad = 1000;
//ARRAYS
float[] x = new float[cantidad];
float[] y = new float[cantidad];
float[] i = new float [cantidad];
int[] c = new int [cantidad];

public void setup() {
  size(640, 480);
  //stroke(50,50);
  noStroke();
  smooth();
  //cargar v\u00eddeo
  clip01 = new Movie(this, "../../../../data/clip.mp4");
  //reiniciar al acabar
  clip01.loop();
  //reproducir una vez
  //clip01.play();
  clip01.speed(1);
  clip01.frameRate(24);
}

public void draw(){
	pinta();
}

// refrescar
public void movieEvent(Movie m) {
  m.read();
}

public void pinta(){
	for (int n = 0; n < cantidad; n++) {
	    x[n] = PApplet.parseInt(random(width));
	    y[n] = PApplet.parseInt(random(height));
	    i[n] = random(10);
	    c[n] = clip01.get(PApplet.parseInt(x[n]), PApplet.parseInt(y[n]));

	    fill(c[n], 25);
	    ellipse(x[n], y[n], i[n], i[n]);
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
