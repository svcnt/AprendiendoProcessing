 
/*
Aprendiendo Processing - Red triangular

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
int num = 20;
float gap, alto, lado;

//SETUP
void setup() {
	size(500, 500);
	background(#202020);
	noFill();
	stroke(#202020);
	smooth();
	colorMode(HSB);
}

//LOOP
void draw() {

	translate((width/num)/3 , 0);

	for (int i = 1; i < num; ++i) {
		for (int ii = 1; ii < num; ++ii) {
			gap = width/num;
			lado = gap;
			alto = sqrt(3)*gap;

			
			triangulo(i*lado, ii*alto, (alto/3));
			triangulo(i*lado - lado/2, ii*alto - alto/2, (alto/3));

		}
	}

	noLoop();
}

void triangulo(float x, float y, float radio){

	float correct = TWO_PI/12;

	fill(random(50,127), 255, random(100,150));

	triangle(
		x + cos(TWO_PI/3 + correct)*radio,
		y + sin(TWO_PI/3 + correct)*radio,
		x + cos(TWO_PI/3*2 + correct)*radio,
		y + sin(TWO_PI/3*2 + correct)*radio,
		x + cos(TWO_PI/3*3 + correct)*radio,
		y + sin(TWO_PI/3*3 + correct)*radio
	);

	fill(random(127,200), 255, random(100,150));

	triangle(
		x + cos(TWO_PI/3 - correct)*radio,
		radio + y + sin(TWO_PI/3 - correct)*radio,
		x + cos(TWO_PI/3*2 - correct)*radio,
		radio + y + sin(TWO_PI/3*2 - correct)*radio,
		x + cos(TWO_PI/3*3 - correct)*radio,
		radio + y + sin(TWO_PI/3*3 - correct)*radio
	);
}	