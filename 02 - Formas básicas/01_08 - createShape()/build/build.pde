/* 

Formas básicas en Processing / createShape()

- Dibujar un pentágono regular

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/
//VARIABLES
//Crear objetos PShape
PShape pent, hex;


void setup() {
	size(400, 400, P2D); //tamaño de la ventana. (ancho, alto)
	background(#202020);
	fill(255,50);
	stroke(255);

	float x = width/2;
	float y = width/2;
	int radio = 100;
	int radio2 = 150;

	//Definir objeto PShape
	pent = createShape();
	pent.beginShape();
	//TWO_PI/5 para pentágono
	//TWO_PI/6 para hexágono
	//etc
	pent.vertex(-sin(TWO_PI/5)*radio , -cos(TWO_PI/5)*radio);
	pent.vertex(-sin(TWO_PI/5*2)*radio , -cos(TWO_PI/5*2)*radio);
	pent.vertex(-sin(TWO_PI/5*3)*radio , -cos(TWO_PI/5*3)*radio);
	pent.vertex(-sin(TWO_PI/5*4)*radio , -cos(TWO_PI/5*4)*radio);
	pent.vertex(-sin(TWO_PI/5*5)*radio , -cos(TWO_PI/5*5)*radio);
	pent.endShape(CLOSE);

	//Definir segundo objeto
	hex = createShape();
	hex.beginShape();
	hex.vertex(-sin(TWO_PI/6)*radio2 , -cos(TWO_PI/6)*radio2);
	hex.vertex(-sin(TWO_PI/6*2)*radio2 , -cos(TWO_PI/6*2)*radio2);
	hex.vertex(-sin(TWO_PI/6*3)*radio2 , -cos(TWO_PI/6*3)*radio2);
	hex.vertex(-sin(TWO_PI/6*4)*radio2 , -cos(TWO_PI/6*4)*radio2);
	hex.vertex(-sin(TWO_PI/6*5)*radio2 , -cos(TWO_PI/6*5)*radio2);
	hex.vertex(-sin(TWO_PI/6*6)*radio2 , -cos(TWO_PI/6*6)*radio2);
	hex.endShape(CLOSE);

	//Invocar objetos 
	//Param: (objeto PShape, coordenadas)
	shape (pent, x, y);
	shape (hex, x, y);

}

void draw() {

}
	