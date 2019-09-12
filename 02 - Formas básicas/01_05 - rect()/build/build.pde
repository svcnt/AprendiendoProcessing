/* 

Formas básicas en Processing / rect()

- Dibuja 4 rectángulos con diferentes propiedades

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

void setup() {
	size(400, 150); //tamaño de la ventana. (ancho, alto)
	//Punto de anclaje del rectángulo:
	//CENTER, CORNER (por defecto)
	rectMode(CENTER); 

}

void draw() {
	background(#202020);
	//Ejemplo 1
	//Cuadrado de 75x75
	stroke(255);
	strokeWeight(1);
	noFill();
	rect(width*0.20, height/2, 75, 75); //Rectángulo (coord x, coord y, ancho, alto)
	//Ejemplo 2
	//Cuadrado con esquinas redondeadas
	rect(width*0.40, height/2, 75, 75, 10); //Rectángulo (coord x, coord y, ancho, alto, redondeado uniforme)
	//Ejemplo 3
	//Cuadrado con diferentes redondeados
	rect(width*0.60, height/2, 75, 75, 10, 15, 20, 25); //Rectángulo (coord x, coord y, ancho, alto, redondeado de cada esquina)
	//Ejemplo 4
	//Redondeados variables positivos y negativos 
	rect(width*0.80, height/2, 75, 75, sin(frameCount*0.05)*25, sin(frameCount*0.06)*25, sin(frameCount*0.07)*25, sin(frameCount*0.08)*25);
}
	