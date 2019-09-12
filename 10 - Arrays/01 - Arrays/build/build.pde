/* 

Aprendiendo Processing - Arrays

- Un array es una secuencia de valores para un tipo de variable

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
int num = 10;
int radio;
PShape poli;
//array de números enteros de nombre 'num_lados'
//almacena los valores 3, 6 y 9, en ese orden
//se accede a los valores indicando el número de orden, comenzando por 0
//ej: num_lados[0] devuelve '3'
int[] num_lados = {3, 6, 12};

//SETUP
void setup() {
	size(512, 512, P2D);
	background(#202020);
	stroke(255);
	fill(255,50);
	smooth();

	radio = (width/num)/2;
	
}

//LOOP
void draw() {

	for (int i = 1; i < num; ++i) {
		for (int ii = 1; ii < num; ++ii) {
			float gap = width/num;
			point(i*gap, ii*gap);
			poli(num_lados[int(random(0,3))], i*gap, ii*gap);
		}
		
	}

	noLoop();
	
}

//dibuja un polígono regular 
//param: número de lados, coordenadas del centro
void poli(int lados, float x, float y){

	poli = createShape();
	poli.beginShape();
	for (int i = 0; i < lados; ++i) {
		poli.vertex(-sin(TWO_PI/lados*i)*radio , -cos(TWO_PI/lados*i)*radio);
	}
	
	poli.endShape(CLOSE);

	shape (poli, x, y);
}