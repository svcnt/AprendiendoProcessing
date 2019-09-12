/* 

Aprendiendo Processing - función sin parámetros

- La función dibuja una flor
- Se invoca dos veces y se las sitúa mediante translate()
- La segunda es simétrica a la primera, empleando scale()

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
	pushMatrix();
		translate(width*0.25, height*0.5);
		flor();
	popMatrix();

	pushMatrix();
		translate(width*0.75, height*0.5);
		scale(-1, 1);
		flor();
	popMatrix();
}

void flor(){
	float centroX = 0;
	float centroY = 0;
	float radio = sin(frameCount*0.05) * 125;
	float posX = centroX+sin(frameCount*0.005)*radio;
	float posY = centroY+cos(frameCount*0.005)*radio;
	point(posX, posY);

}