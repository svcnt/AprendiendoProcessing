/* 

Aprendiendo Processing - Clases

- Una clase crea instancias de un objeto y le aplica uno o varios métodos
- Ver comentarios en el código

José Vicente Araújo
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
void setup(){
  size(400,400);
  background(#202020);
  colorMode(HSB);
  //Crea los parámetros para cada objeto 
  for (int i=0; i< puntos.length; i++){
  	color c = color(random(125,255));
    puntos[i] = new Punto (random(width), random(height), c, random(10));
  }
}

//LOOP
void draw(){
  background(#202020);
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
  color c; //Color
  float dif; //Diferencia (tamaño, movimiento)
 
//CONSTRUCTOR
  Punto(float punto_x, float punto_y, color punto_c, float punto_dif) {
    //Creamos un constructor con el mismo nombre de la clase y le pasamos sus parámetros
    x = punto_x;
    y = punto_y;
    c = punto_c;
    dif = punto_dif;
  }
//MÉTODOS 
  void forma() {
    //Creamos un método 'forma' para mostrar los objetos 'Punto'.
    fill(c, 75);
    noStroke();
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