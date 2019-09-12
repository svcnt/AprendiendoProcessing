/* 

Aprendiendo Processing - translate()

- Tres cuadrados creados en las coordenadas 0, 0 
- Trasladados a diferentes posiciones

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES

//SETUP
void setup() {
	size(400,200);
	background(#202020);
	noFill();
	//definir rect a partir de su centro
	rectMode(CENTER);
}

//LOOP
void draw() {

	//Primer vector
	stroke(#FFFF00);
	line(0, 0, width*0.25, height*0.5);
	ellipse(width*0.25, height*0.5, 10, 10);
	//Primer cuadrado
	stroke(255);
	translate(width*0.25, height*0.5);
	rect(0, 0, 75, 75);

	//Segundo vector
	stroke(#00FFFF);
	line(0, 0, width*0.25, 0);
	ellipse(width*0.25, 0, 10, 10);
	//Segundo cuadrado
	stroke(255);
	translate(width*0.25, 0);
	rect(0, 0, 75, 75);

	//Tercer vector
	stroke(#FF00FF);
	line(0, 0, width*0.25, 0);
	ellipse(width*0.25, 0, 10, 10);
	//Tercer cuadrado
	stroke(255);
	translate(width*0.25, 0);
	rect(0, 0, 75, 75);

	

}