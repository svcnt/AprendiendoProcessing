/* 

Aprendiendo Processing - pushMatrix() y popMatrix();

- 6 cuadrados que giran

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
float rotation;

//SETUP
void setup() {
	size(400,400);
	background(#202020);
	noFill();
	stroke(255);
	rectMode(CENTER);
}

//LOOP
void draw() {
	background(#202020);
	fill(255,33);

	rotation = sin(frameCount*0.05)*QUARTER_PI;

	//Primera fila
	//Primer cuadrado
	pushMatrix();
	translate(width*0.25, height*0.33);
	rotate(frameCount*0.05);
	rect(0, 0, 100, 100);
	popMatrix();
	//Segundo cuadrado
	pushMatrix();
	translate(width*0.5, height*0.33);
	rotate(frameCount*0.05);
	rect(0, 0, 100, 100);
	popMatrix();
	//Tercer cuadrado
	pushMatrix();
	translate(width*0.75, height*0.33);
	rotate(frameCount*0.05);
	rect(0, 0, 100, 100);
	popMatrix();

	//Segunda fila
	//Consigue el mismo resultado que en la primera fila empleando un bucle
	//Ver carpeta 08 - Condicionales y bucles
	for (int i = 1; i < 4; ++i) {
		pushMatrix();
		translate(width*(0.25*i), height*0.66);
		rotate(frameCount*0.05);
		rect(0, 0, 100, 100);
		popMatrix();
	}

}