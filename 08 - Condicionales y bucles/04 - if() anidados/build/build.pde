/* 

Aprendiendo Processing / Condicionales - if() anidados

- Si defines un condicional dentro de otro, 
el segundo no se evalúa si la condición inicial no se cumple 

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
float ellipse1x, ellipse1y, ellipse2x, ellipse2y;
float distancia;

//SETUP
void setup() {
	size(512, 512);
	background(#202020);
	noFill();
	//stroke(255,50);
}

//LOOP
void draw() {
	fill(#202020, 5);
	//rect(-5, -5, width+10, height+10);

	ellipse1x = width/2 + sin(frameCount*0.05)*sin(frameCount*0.005)*250;
	ellipse1y = height/2 + cos(frameCount*0.05)*sin(frameCount*0.005)*250;

	ellipse2x = width/2 + sin(frameCount*-0.05)*sin(frameCount*0.006)*250;
	ellipse2y = height/2 + cos(frameCount*-0.05)*sin(frameCount*0.007)*250;

	distancia = dist(ellipse1x, ellipse1y, ellipse2x, ellipse2y);

	noStroke();

	

	if (distancia < 200) {
		stroke(255-distancia, 50);
		line(ellipse1x, ellipse1y, ellipse2x, ellipse2y);
		if (distancia < 100) {
			ellipse(ellipse1x, ellipse1y, 5, 5);
			ellipse(ellipse2x, ellipse2y, 5, 5);
			if (distancia < 25) {
				ellipse(ellipse1x, ellipse1y, 15, 15);
				ellipse(ellipse2x, ellipse2y, 15, 15);

			} 
		}

	} else {
		//stroke(255);
		strokeWeight(1);
		noStroke();
	}
	
}