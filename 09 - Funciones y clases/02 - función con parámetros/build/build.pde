/* 

Aprendiendo Processing - función con parámetros

- Como 01, pero la posición y la simetría se les asigna como parámetros de la función flor()

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES


//SETUP
void setup() {
	size(500, 250);
	background(#202020);
	stroke(255);
	noFill();
	
}

//LOOP
void draw() {

		flor(width*0.25, height*0.5, 1);
		flor(width*0.75, height*0.5, -1);

}

void flor(float centroX, float centroY, float sim){
	pushMatrix();
		translate(centroX, centroY);
		float radio = sin(frameCount*0.05) * 125;
		float posX = sim*sin(frameCount*0.005)*radio;
		float posY = cos(frameCount*0.005)*radio;
		point(posX, posY);
	popMatrix();
}