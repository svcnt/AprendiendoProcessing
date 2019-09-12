/* 

Aprendiendo Processing - PFont

- Texto

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES

//SETUP
void setup() {
	size(400, 400);
	background(#202020);
	noStroke();
	fill(255);
	smooth();

	//crea obj PFont
	PFont miFuente;
	//Archivo fuente .vlw en carpera 'data'.
	//Desde la IDE, clic en Tools / Create font ...
	//para crear e importar el archivo fuete
	miFuente = loadFont("ACaslonPro-SemiboldItalic-48.vlw");
	//definir fuente y tamaño
	textFont(miFuente, 48);
	//texto
	text("Processing", width/2, height*0.25);
	//alineación
	textAlign(CENTER, BOTTOM); // CENTER, LEFT, RIGHT, BOTTOM, CENTER, TOP
	//texto 2
	text("Processing", width/2, height*0.5);
	
}

//LOOP
void draw() {

}