/* 

Aprendiendo Processing - color 

background() //color de fondo (int, hex, color)
colorMode() //modo (RGB (defecto), HSB)
fill() //relleno (color, alfa)
noFill() //sin relleno
noStroke() //sin línea
stroke() //color de línea (color, alfa)

- Dibujar un pentágono regular y un hexágono
- Colores aleatorios

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/
//VARIABLES
PShape pent, hex;


void setup() {
	size(400, 400, P2D); //tamaño de la ventana. (ancho, alto)
	background(#202020);
	//modo de color
	colorMode(HSB);
	
	//variables tono, saturación y brillo
	float hue, sat, bri;
	hue = random(255); //aleatorio
	sat = random(50,200); //aleatorio, valores restringidos
	bri = 200; //valor constante

	fill(hue, sat, bri, 50);
	stroke(255);

	//coordenadas
	float x = width/2;
	float y = width/2;
	//radio de la circunferencia circunscrita al polígono
	int radio = 100;
	int radio2 = 150;

	pent = createShape();
	pent.beginShape();
	pent.vertex(-sin(TWO_PI/5)*radio , -cos(TWO_PI/5)*radio);
	pent.vertex(-sin(TWO_PI/5*2)*radio , -cos(TWO_PI/5*2)*radio);
	pent.vertex(-sin(TWO_PI/5*3)*radio , -cos(TWO_PI/5*3)*radio);
	pent.vertex(-sin(TWO_PI/5*4)*radio , -cos(TWO_PI/5*4)*radio);
	pent.vertex(-sin(TWO_PI/5*5)*radio , -cos(TWO_PI/5*5)*radio);
	pent.endShape(CLOSE);

	hex = createShape();
	hex.beginShape();
	hex.vertex(-sin(TWO_PI/6)*radio2 , -cos(TWO_PI/6)*radio2);
	hex.vertex(-sin(TWO_PI/6*2)*radio2 , -cos(TWO_PI/6*2)*radio2);
	hex.vertex(-sin(TWO_PI/6*3)*radio2 , -cos(TWO_PI/6*3)*radio2);
	hex.vertex(-sin(TWO_PI/6*4)*radio2 , -cos(TWO_PI/6*4)*radio2);
	hex.vertex(-sin(TWO_PI/6*5)*radio2 , -cos(TWO_PI/6*5)*radio2);
	hex.vertex(-sin(TWO_PI/6*6)*radio2 , -cos(TWO_PI/6*6)*radio2);
	hex.endShape(CLOSE);

	shape (pent, x, y);
	shape (hex, x, y);

}

void draw() {

}
	