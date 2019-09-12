/* 

Aprendiendo Processing - Ejemplo 05

- Visualizar un campo noise()
1.- Lanzamos una serie de segmentos sobre la ventana
2.- Hacemos que su dirección oscile según la posición de sus coordenadas en un campo noise()

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//LIBRERÍAS
//VARIABLES GLOBALES
//n: posiciones en el campo noise()
//vel: velocidad a la que nos movemos en el eje Z
float n, vel; 
float zoom = 0.0025;
//lg: longitud de los segmentos
int lg = 25;
//dist: distancia entre orígenes de los segmentos
int dist = 5;


void setup() {
  size(800, 400);
  background(#202020);
  noFill();
}

void draw(){
	background(#202020);
	vel = frameCount*0.005;
	for (int i = 0; i < width; i+=dist) {
		for (int ii = 0; ii < height; ii+=dist) {
			//posiciones x, y, z de cada punto en el campo noise()
			n = noise(i*zoom, ii*zoom, vel)*TWO_PI;
			stroke(255, 60);
			line(i, ii, i+sin(n)*lg, ii+cos(n)*lg);
		}
	}
	
}