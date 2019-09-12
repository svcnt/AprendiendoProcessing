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

Aprendiendo Processing - Ejemplo 06

- 

Jos\u00e9 Vicente Ara\u00fajo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//LIBRER\u00cdAS

//VARIABLES GLOBALES
//Distancia entre puntos origen = tama\u00f1o
int dist = 50;
//Banco de im\u00e1genes
String[] tiles = { "01.svg", "02.svg", "03.svg", "04.svg", "05.svg", "06.svg", "07.svg" };
//Paleta de colores
int[] paleta = { 0xffC74029, 0xffFAE8CD, 0xff128085, 0xff385052, 0xffF0AD44};
//Escalas de ampliaci\u00f3n
int[] escala = {1, 2, 4};

//SETUP
public void setup() {
  size(500, 500);
  background(0xff202020);
  noFill();
  noStroke();
  //shapeMode(CENTER);
  frameRate(0.5f);
}


//LOOP
public void draw(){
	background(0xff202020);

	//Generador de mosaicos

	//Repetir 2 veces
	for (int n = 0; n < 2; ++n) {
		//columnas
		for (int i = 0; i < width; i+=dist) {
			//filas
			for (int ii = 0; ii < height; ii+=dist) {
				//Toma un color aleatorio de la Paleta
				fill(paleta[PApplet.parseInt(random (paleta.length))]);
				//Crea objeto PShape
				PShape tile;
				//Le asigna una imagen
				tile = loadShape(
						tiles[PApplet.parseInt(random (tiles.length))]
					);
				//Eliminainformaci\u00f3n de estilo
				tile.disableStyle();
				
				//Dibuja cada elemento:

				//Posici\u00f3n
				translate(i, ii);
				//Giro
				rotate(PApplet.parseInt(random(4))*HALF_PI);
				//Escala *1, *2 o *4 aleatoriamente
				int sz = escala[PApplet.parseInt(random(2))];
				//Dibuja la tesela
				shape(tile, 0, 0, dist*sz, dist*sz);
				resetMatrix();
			}
		}
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
