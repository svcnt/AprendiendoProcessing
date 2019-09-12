/* 

Formas básicas en Processing / arc()



José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

void setup() {
	size(400, 400); //tamaño de la ventana. (ancho, alto)
	

}

void draw() {
	background(#202020);
	//Fila superior
	//Ejemplo 1
	//Arco simple
	stroke(255);
	strokeWeight(1);
	noFill();
	arc(width*0.25, height*0.25 , 75, 75, 0, PI); //coord x, coord y, ancho, alto, inicio, fin
	//Ejemplo 2
	//Varios arcos de diferentes grosores encadenados
	arc(width*0.5, height*0.25, 75, 75, 0, HALF_PI);
	strokeWeight(2);
	arc(width*0.5, height*0.25, 75, 75, HALF_PI, PI);
	strokeWeight(4);
	arc(width*0.5, height*0.25, 75, 75, PI, PI+QUARTER_PI);
	//Ejemplo 3
	//Arco de ángulo variable
	strokeWeight(1);
	arc(width*0.75, height*0.25, 75, 75, 0, PI+sin(frameCount*0.05)*PI);
	//Fila media
	//Ejemplo 4
	//Arco con inicio y fin variables (mismo ángulo)
	strokeWeight(1);
	arc(width*0.25, height*0.5, 75, 75, HALF_PI+sin(frameCount*0.05)*PI, PI+sin(frameCount*0.05)*PI);
	//Ejemplo 5
	//Arco con cuerda
	strokeWeight(1);
	arc(width*0.5, height*0.5, 75, 75, 0, PI+sin(frameCount*0.05)*PI, CHORD);
	//Ejemplo 6
	//Sector
	strokeWeight(1);
	arc(width*0.75, height*0.5, 75, 75, 0, PI+sin(frameCount*0.05)*PI, PIE);
	//Ejemplo 7
	//Arcos elípticos girando
	strokeWeight(1);
	arc(width*0.5, height*0.75, 200, 75, frameCount*0.05, frameCount*0.05+TWO_PI/3);
	arc(width*0.5, height*0.75, 195, 70, frameCount*0.06, frameCount*0.06+TWO_PI/3);
	arc(width*0.5, height*0.75, 190, 65, frameCount*0.07, frameCount*0.07+TWO_PI/3);

	
}
	