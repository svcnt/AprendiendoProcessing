/* 

Aprendiendo Processing - scale();

- Dos grupos de cuadrados transformados con scale()

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
	size(400,200);
	background(#202020);
	noFill();
	stroke(255);
	rectMode(CENTER);
}

//LOOP
void draw() {
	background(#202020);

	rotation = sin(frameCount*0.05)*QUARTER_PI;

	//Primer grupo
	//Primer cuadrado
	rect(width/4, height/2, 100, 100);
	//Segundo cuadrado
	//80% menor
	scale(0.8);
	rect(width/4, height/2, 100, 100);
	//Tercer cuadrado
	//60% menor
	scale(0.6);
	rect(width/4, height/2, 100, 100);

	resetMatrix();

	//Segundo Grupo
	//Primer cuadrado
	pushMatrix();
		translate(width*0.75, height/2);
		rect(0, 0, 100, 100);
	popMatrix();
	//Segundo cuadrado
	pushMatrix();
		translate(width*0.75, height/2);
		scale(0.8);
		rect(0, 0, 100, 100);
	popMatrix();
	//Tercer cuadrado
	pushMatrix();
		translate(width*0.75, height/2);
		scale(0.6);
		rect(0, 0, 100, 100);
	popMatrix();
}