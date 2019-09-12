/* 

Aprendiendo Processing - PImage

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
	// le asignamos como valor la función  loadimage(), que toma como parámetro la URL de la imagen
	img = loadImage("../../../data/img.jpg");
	// establecemos como ancho y alto de la ventana los de la imagen importada
	size(img.width, img.height);
	// cargamos la imagen en las coordenadas 0, 0
	image(img, 0, 0);
}

//LOOP
void draw() {
	
}