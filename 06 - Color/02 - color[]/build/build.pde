/* 

Aprendiendo Processing - color[]

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

float x = 0;
//array de colores
//ver carpeta 10 - Arrays
color[] paleta = { #C74029, #FAE8CD, #128085, #385052, #F0AD44};

void setup(){
	size(500, 500);
	rectMode(CENTER);
	smooth();
	noStroke();
	background(paleta[1]);
}

void draw(){
	//mientras x e y estén dentro de la ventana
	while (x<width) {
	  float y=0;
	  while (y<height) {
	  	//ancho y alto aleatorio para cada rect
	    float w=random(5, 25);
	    float h=random(5, 25);
	    //sombra
	    fill(50, 50);
	    rect(x+12, y+12, w, h);
	    //color tomado de la paleta
	    fill(paleta[int(random (5))]);
	    rect(x+10, y+10, w, h);
	    y+=15; //sumar 15 a x
	  }
	  x+=15; //sumar 15 a y
	}

}