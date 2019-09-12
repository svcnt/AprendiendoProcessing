/* 

Aprendiendo Processing - Estructura Clase

- 

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//VARIABLES GLOBALES
color co;
Punto puntos;

//SETUP
void setup(){
  size(400,400);
  background(#202020);
  colorMode(HSB);
}

//LOOP
void draw(){
  background(#202020);
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
  float dif; //Diferencia (tamaño, movimiento)
 
//CONSTRUCTOR
  Punto(float punto_x, float punto_y, float punto_dif) {
    //Creamos un constructor con el mismo nombre de la clase y le pasamos sus parámetros
    x = punto_x;
    y = punto_y;
    dif = punto_dif;
  }
//MÉTODOS 
  void forma() {
    //Creamos un método 'forma' para mostrar los objetos 'Punto'.
    ellipse(x, y, dif, dif);
  }

  void mover(){
  	//Creamos un método 'mover' para mostrar los objetos 'Punto'.

  	x = x + sin(frameCount*0.0005*dif);
  	y = y + cos(frameCount*0.0005*dif);

  	if (x<0) {x=width;} else 
  	if (x>width) {x=0;} else 
  	if (y<0) {y=height;} else 
  	if (y>height) {y=0;}
  		
  	}
  }