/* 

Aprendiendo Processing - rotate();

- Tres cuadrados girando alrededor de 0, 0

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES

//SETUP
void setup() {
	size(400,400);
	background(#202020);
	noFill();
	stroke(255);
	rectMode(CENTER);
	smooth();
}

//LOOP
void draw() {
	background(#202020);
	rotate(sin(frameCount*0.05)*0.1);
	rect(width*0.25, height*0.5, 75, 75);
	rotate(sin(frameCount*0.05)*0.1);
	rect(width*0.5, height*0.5, 75, 75);
	rotate(sin(frameCount*0.05)*0.1);
	rect(width*0.75, height*0.5, 75, 75);
}