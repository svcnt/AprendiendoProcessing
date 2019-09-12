/* 

Formas básicas en Processing / createShape()

- Dibujar un polígono regular

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/
//VARIABLES
//Crear objeto PShape
PShape poli;
//Número de lados
int lados = 7;
//radio de la cc
int radio = 100;
//coordenadas
float x = 100;
float y = 100;


void setup() {
	size(400, 400, P2D); //tamaño de la ventana. (ancho, alto)
	background(#202020);
	fill(255,50);
	stroke(255);

	poli = createShape();
	poli.beginShape();
	for (int i = 0; i < lados; ++i) {
		poli.vertex(x-sin(TWO_PI/lados*i)*radio , y-cos(TWO_PI/lados*i)*radio);
	}
	
	poli.endShape(CLOSE);

	shape (poli, x, y);
	
}

void draw() {

}
	