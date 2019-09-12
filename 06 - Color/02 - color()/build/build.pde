/* 

Aprendiendo Processing - color()

- Tres circ. transparentes de colores básicos RGB 

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/
//VARIABLES
color rojo = color(100, 0, 0);
color verde = color(0, 100, 0);
color azul = color(0, 0, 100);

//SETUP
void setup() {
	size(400, 400, P2D); //tamaño de la ventana. (ancho, alto)
	background(#202020);

	float x = width/2;
	float y = width/2;
	int diam = 200;
	int radio = 50;

	//modo de color y rango de valores
	colorMode(HSB, 100);

	stroke(#202020);

	fill(rojo, 50);
	ellipse (x+sin(TWO_PI/3)*radio, y+cos(TWO_PI/3)*radio, diam, diam);
	fill(verde, 50);
	ellipse (x+sin(TWO_PI/3*2)*radio, y+cos(TWO_PI/3*2)*radio, diam, diam);
	fill(azul, 50);
	ellipse (x+sin(TWO_PI/3*3)*radio, y+cos(TWO_PI/3*3)*radio, diam, diam);

}

void draw() {

}
	