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

Aprendiendo Processing - Estructura Clase

- 

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


/* 

Aprendiendo Processing - Clases

- Una clase crea instancias de un objeto y le aplica uno o varios m\u00e9todos
- Ver comentarios en el c\u00f3digo

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//VARIABLES GLOBALES Y ARRAYS
int co;
Punto puntos;

//SETUP
public void setup(){
  size(400,400);
  background(0xff202020);
  colorMode(HSB);
}

//LOOP
public void draw(){
  background(0xff202020);
  for (int i = 0; i < 100; ++i) {
  	puntos = new Punto(random(width), random(height), random(15));
  	puntos.forma();
  	puntos.mover();
  }
}

//CLASE
class Punto {
  //Declaramos la clase 'Punto' con cuatro propiedades
  float x; //Coord x
  float y; //Coord Y
  float dif; //Diferencia (tama\u00f1o, movimiento)
 
//CONSTRUCTOR
  Punto(float punto_x, float punto_y, float punto_dif) {
    //Creamos un constructor con el mismo nombre de la clase y le pasamos sus par\u00e1metros
    x = punto_x;
    y = punto_y;
    dif = punto_dif;
  }
//M\u00c9TODOS 
  public void forma() {
    //Creamos un m\u00e9todo 'forma' para mostrar los objetos 'Punto'.
    ellipse(x, y, dif, dif);
  }

  public void mover(){
  	//Creamos un m\u00e9todo 'mover' para mostrar los objetos 'Punto'.

  	x = x + sin(frameCount*0.0005f*dif);
  	y = y + cos(frameCount*0.0005f*dif);

  	if (x<0) {x=width;} else 
  	if (x>width) {x=0;} else 
  	if (y<0) {y=height;} else 
  	if (y>height) {y=0;}
  		
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
