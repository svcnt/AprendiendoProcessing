/* 

Aprendiendo Processing / Condicionales - if()

- Ver comentarios en el código

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
float ellipse1x, ellipse1y, ellipse2x, ellipse2y;

//SETUP
void setup() {
	size(512, 512);
	//background(#202020);
	noFill();
	stroke(255);
}

//LOOP
void draw() {
	fill(#202020, 10);
	//fondo transparente
	rect(-5, -5, width+10, height+10);

	ellipse1x = width/2 + sin(frameCount*0.06)*sin(frameCount*0.009)*250;
	ellipse1y = height/2 + cos(frameCount*0.06)*sin(frameCount*0.009)*250;

	ellipse2x = width/2 + sin(frameCount*-0.05)*sin(frameCount*0.0005)*225;
	ellipse2y = height/2 + cos(frameCount*-0.05)*sin(frameCount*0.0005)*225;

	ellipse(ellipse1x, ellipse1y, 5, 5);
	ellipse(ellipse2x, ellipse2y, 5, 5);

	//Si la distancia entre los centros de las circ es menor que 150
	if (dist(ellipse1x, ellipse1y, ellipse2x, ellipse2y) < 150) {
		//color de línea: azul
		stroke(#0000ff);
		//líea entre ambos centros
		line(ellipse1x, ellipse1y, ellipse2x, ellipse2y);
	//Si por el contrario la distancia es mayor que 250
	} else if (dist(ellipse1x, ellipse1y, ellipse2x, ellipse2y) > 250) {
		//aumenta el grosor de línea
		strokeWeight(5);
	//Si no se da ninguno de esos casos	
	} else {
		//deja la línea como estaba
		stroke(255);
		strokeWeight(1);
	}
	
}