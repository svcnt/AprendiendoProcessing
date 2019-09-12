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
//Crear un array, llamado 'puntos' 
//de 100 objetos de la clase Punto
Punto[] puntos = new Punto[100];

//SETUP
public void setup(){
  size(400,400);
  background(0xff202020);
  colorMode(HSB);
  //Crea los par\u00e1metros para cada objeto 
  for (int i=0; i< puntos.length; i++){
  	int c = color(random(125,255));
    puntos[i] = new Punto (random(width), random(height), c, random(10));
  }
}

//LOOP
public void draw(){
  background(0xff202020);
  for(int i=1; i<puntos.length; i++){
    puntos[i].forma();
    puntos[i].mover();
  }
}

//CLASE
class Punto {
  //Declaramos la clase 'Punto' con cuatro propiedades
  float x; //Coord x
  float y; //Coord Y
  int c; //Color
  float dif; //Diferencia (tama\u00f1o, movimiento)
 
//CONSTRUCTOR
  Punto(float punto_x, float punto_y, int punto_c, float punto_dif) {
    //Creamos un constructor con el mismo nombre de la clase y le pasamos sus par\u00e1metros
    x = punto_x;
    y = punto_y;
    c = punto_c;
    dif = punto_dif;
  }
//M\u00c9TODOS 
  public void forma() {
    //Creamos un m\u00e9todo 'forma' para mostrar los objetos 'Punto'.
    fill(c, 75);
    noStroke();
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
