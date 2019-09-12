/* 

Formas básicas en Processing / ellipse()

-Dibuja varias circunferencias o grupos de circunferencias

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
	//Ejemplo 1
	//Circunferencia sin relleno
	stroke(255); //color de línea
	strokeWeight(1); //grosor de línea
	noFill(); //sin relleno
	ellipse(width*0.25, height*0.25, 100, 100);
	//Ejemplo 2
	//línea y relleno semitransparentes, con colores distintos
	stroke(#00FFFF,50); //color de línea, transparencia
	strokeWeight(8);
	fill(255,50);
	ellipse(width*0.75, height*0.25, 100, 100);
	//Ejemplo 3
	stroke(255,50);
	strokeWeight(1);
	noFill();
	//Elipse
	ellipse(width*0.25, height*0.75, 150, 75);
	fill(255);
	//Circunferencia pequeña que gira
	ellipse(width*0.25+75*sin(frameCount*0.05), height*0.75+37.5*cos(frameCount*0.05), 4, 4);
	//Ejemplo 4
	//Circunferencia de altura variable
	//aparentememte gira en el eje X
	stroke(255);
	strokeWeight(1);
	noFill();
	ellipse(width*0.75, height*0.75, 100, 100*sin(frameCount*0.05));
}
	