/* 

Aprendiendo Processing - copy()

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
// declaramos una variable del tipo PImage de nombre 'img'
PImage img;

//SETUP
void setup() {

	PImage img = loadImage("../../../data/img.jpg");
	size(400, 400);
	background(0);
	//copy toma estos 9 parámetros: 
	//nombre de la variable
	//coord. x e y de la esquina sup. izq. del recorte
	//anchura y altura del recorte
	//coord. x e y de la posición donde se inserta
	//ancho y alto del recuadro en el que se inserta
	copy(img, 150, 50, 200, 200, 10, 10, width-20, height-20);

}

//LOOP
void draw() {
	
}