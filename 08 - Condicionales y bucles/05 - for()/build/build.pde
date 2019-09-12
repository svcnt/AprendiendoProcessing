/* 

Aprendiendo Processing - for()

- Mismo resultado que en 07 / Transformaciones - 04 usando un bucle

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

	rotation = sin(frameCount*0.05)*HALF_PI;

	for (int i = 1; i < 15; ++i) {
		pushMatrix();
		translate(width*0.5, height*0.5);
		rotate(lerp (rotation/i, rotation, 1/i));
		rect(0, 0, 20*i, 20*i);
		popMatrix();
		
	}
}