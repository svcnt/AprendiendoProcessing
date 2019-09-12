/*

Formas básicas en Processing / point()

- Dibuja varios grupos de puntos

José Vicente Araújo
http://dunadigital.com
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

void setup() {
	size(450, 150); //tamaño de la ventana. (ancho, alto)


}

void draw() {
	background(#202020); //color del fondo (HEX)
	//Ejemplo 1
	//Punto blanco opaco
	stroke(255); //color de la línea (int >=0 <=255)
	strokeWeight(5); //grosor de la línea (píxeles)
	point(width*0.2, height/2); //punto (coordenada x, coordenada y)
	//Punto 2
	//Varios puntos transparentes de diferente grosor
	stroke(255,25); //color de la línea (int >=0 <=255, transparencia)
	strokeWeight(25);
	point(width*0.4, height/2);
	strokeWeight(20);
	point(width*0.4, height/2);
	strokeWeight(15);
	point(width*0.4, height/2);
	strokeWeight(10);
	point(width*0.4, height/2);
	//Punto 3
	//Puntos transparentes de diferentes colores
	strokeWeight(60);
	stroke(#ff0000,50);
	point(width*0.6-20, height/2-10);
	stroke(#00ff00,50);
	point(width*0.6+20, height/2-10);
	stroke(#0000ff,50);
	point(width*0.6, height/2+20);
	//Punto 4
	//Un punto gira alrededor de otro
	//La posición del punto en movimiento se calcula
	//mediante el seno (sin()) y coseno (cos())
	//de un ángulo variable (frameCount)
	stroke(255);
	strokeWeight(50);
	point(width*0.8, height/2);
	strokeWeight(5);
	point(width*0.8+50*sin(frameCount*0.05), height/2+50*cos(frameCount*0.05));

}
