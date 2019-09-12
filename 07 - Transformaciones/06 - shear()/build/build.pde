/* 

Aprendiendo Processing / shear()

- Estirar un conjunto de dos rectángulos que forman una X

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
	noStroke();
	fill(255);
	rectMode(CENTER);
}

//LOOP
void draw() {
	background(#202020);
	
	//aplica dos transformaciones al conjunto
	translate(width/2, height/2);
	shearY(sin(frameCount*0.05)*QUARTER_PI/2);
	shearX(cos(frameCount*0.05)*QUARTER_PI/2);

	//estira el primer rect
	pushMatrix();
	shearX(QUARTER_PI);
	rect(0, 0, 20, 200);
	popMatrix();

	//estira el segundo
	pushMatrix();
	//translate(width/2, height/2);
	shearX(-QUARTER_PI);
	rect(0, 0, 20, 200);
	popMatrix();

}