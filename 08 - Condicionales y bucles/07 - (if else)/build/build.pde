/* 

Aprendiendo Processing - ?:

- Modificar el color de la línea si es par 

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
int a, b;

//SETUP
void setup() {
	size(400,400);
	background(#202020);
	noStroke();
	fill(255,33);
}

//LOOP
void draw() {

	for (int i = 0; i < 40; ++i) {
		b = i % 2;
		//evalúa la condición
		//si se cumple, asigna el valor 125 a la variable
		//si no se cumple, le asigna valor 255
		a = (b == 1)? 125 : 255;
		fill(a);
		rect(i*10, 0, 1, height);
	}
	
}