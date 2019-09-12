/* 

Formas básicas en Processing / bezierPoint()

- Calcula la posición de un punto en una curva de Bezier
- El último parámetro define la proporción (0 - 1) 

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

float p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y; 
float x, y;

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
	p2x = 100+cos(frameCount*0.05)*100;
	p2y = height/2+sin(frameCount*0.05)*100;
	p3x = width-100+cos(frameCount*0.04)*100;
	p3y = height/2+sin(frameCount*0.04)*100;
	background(#202020); //color del fondo (HEX)
	stroke(100);
	line(p1x, p1y, p2x, p2y);
	line(p4x, p4y, p3x, p3y);
	stroke(255);
	bezier(p1x, p1y, p2x, p2y, p3x, p3y, p4x, p4y);
	x = bezierPoint(p1x, p2x, p3x, p4x, 0.5); // puntos de la curva, posición relativa del punto
	y = bezierPoint(p1y, p2y, p3y, p4y, 0.5);
	ellipse(x, y, 5, 5);

	
}