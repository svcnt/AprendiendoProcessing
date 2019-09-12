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

Aprendiendo Processing - loadShape()

- Carga una imagen vectorial en formato SVG

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//crea objetos PShape para la imagen y para cada una de sus capas
PShape vec, capa1, capa2, capa3, capa4;
//paleta de colores
int[] paleta = { 0xffC74029, 0xffFAE8CD, 0xff128085, 0xff385052, 0xffF0AD44};


public void setup() {
  size(400, 400);
  background(0xff202020);
  //carga el archivo vectorial
  vec = loadShape("../../../data/vec.svg");
  //'count' = n\u00famero de capas en 'vec'
  int count = vec.getChildCount();
  println(count);
  //carga cada capa de 'vec' en un objeto PShape distinto
  capa1 = vec.getChild(0);
  //y elimina su informaci\u00f3n de estilo (trazo, relleno...)
  capa1.disableStyle();

  capa2 = vec.getChild(1);
  capa2.disableStyle();

  capa3 = vec.getChild(2);
  capa3.disableStyle();

  capa4 = vec.getChild(3);
  capa4.disableStyle();

  noStroke();
  stroke(0xff202020);

  //toma un color de la paleta
  fill(paleta[PApplet.parseInt(random (paleta.length))]);
  //dibuja una capa del archivo vectorial
  shape(capa1, 0, 0);

  fill(paleta[PApplet.parseInt(random (paleta.length))]);
  shape(capa2, 0, 0);

  fill(paleta[PApplet.parseInt(random (paleta.length))]);
  shape(capa3, 0, 0);

  fill(paleta[PApplet.parseInt(random (paleta.length))]);
  shape(capa4, 0, 0);
}

public void draw() {
  

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
