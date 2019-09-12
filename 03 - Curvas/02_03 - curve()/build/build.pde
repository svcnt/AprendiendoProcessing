/* 

Formas básicas en Processing / curve()

- Dibuja una curva tipo curve() (blanco) y sus vectores de control (gris)
- Dibuja también un punto de la cuerva

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

float p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y, x, y; 

void setup() {
	size(450, 200); //tamaño de la ventana. (ancho, alto)
	noFill();

}

void draw() {
	//Extremos
	p1x = 100;
	p1y = height/2;
	p4x = width-100;
	p4y = height/2;
	//Control
	p2x = 100+cos(frameCount*0.05)*50;
	p2y = height/2+sin(frameCount*0.05)*50;
	p3x = width-100+cos(frameCount*0.04)*50;
	p3y = height/2+sin(frameCount*0.04)*50;
	background(#202020); //color del fondo (HEX)
	stroke(100);
	line(p1x, p1y, p2x, p2y);
	line(p4x, p4y, p3x, p3y);
	stroke(255);
	float t = map(mouseX, 0, width, -5, 5);
  	curveTightness(t);
	curve(p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y);
	x = curvePoint(p1x, p2x, p3x, p4x, 0.5); // puntos de la curva, posición relativa del punto
	y = curvePoint(p1y, p2y, p3y, p4y, 0.5);
	ellipse(x, y, 5, 5);
	
}