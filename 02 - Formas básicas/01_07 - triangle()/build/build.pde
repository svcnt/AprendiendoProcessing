/* 

Formas básicas en Processing / quad()

- Dibujar un triángulo equilátero 
definiendo la posición de sus vértices a partir del centro

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

int radio = 100;
float correct = TWO_PI/12;

void setup() {
	size(400, 400); //tamaño de la ventana. (ancho, alto)
	noFill();
	stroke(255);

}

void draw() {
	background(#202020);
	//Ejemplo 1: triángulo equilátero
	triangle(

		/* OPCIÓN 1, basada en la relación lado-altura
		
		width/2, //coords esquina 1
		height/2-radio,
		width/2+sqrt(radio*radio-radio/2*radio/2), //coords esquina 2
		height/2+radio/2,
		width/2-sqrt(radio*radio-radio/2*radio/2), //coords esquina 3
		height/2+radio/2
		
		*/

		/* OPCIÓN 2, basada en división de la circunferencia */

		width/2 + cos(TWO_PI/3 + correct)*radio,
		height/2 + sin(TWO_PI/3 + correct)*radio,
		width/2 + cos(TWO_PI/3*2 + correct)*radio,
		height/2 + sin(TWO_PI/3*2 + correct)*radio,
		width/2 + cos(TWO_PI/3*3 + correct)*radio,
		height/2 + sin(TWO_PI/3*3 + correct)*radio
	);
	
}
	