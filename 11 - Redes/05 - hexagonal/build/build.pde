/* 

Aprendiendo Processing - Red triangular

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
int num = 15;
float gap, alto, lado;
PShape hex;

//SETUP
void setup() {
	size(400, 400, P2D);
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

			
			tesela(i*lado, ii*alto, (alto/3));
			tesela(i*lado - lado/2, ii*alto - alto/2, (alto/3));

		}
	}

	noLoop();
}

void tesela(float x, float y, float radio){

	float correct = TWO_PI/12;
	float hue = random(map(x*y, 0, 160000, 0, 255));
	float sat = 127;
	float bri = random(50, 200);
	fill(hue, sat, bri);

	hex = createShape();
	hex.beginShape();
	hex.vertex(-sin(TWO_PI/6)*radio , -cos(TWO_PI/6)*radio);
	hex.vertex(-sin(TWO_PI/6*2)*radio , -cos(TWO_PI/6*2)*radio);
	hex.vertex(-sin(TWO_PI/6*3)*radio , -cos(TWO_PI/6*3)*radio);
	hex.vertex(-sin(TWO_PI/6*4)*radio , -cos(TWO_PI/6*4)*radio);
	hex.vertex(-sin(TWO_PI/6*5)*radio , -cos(TWO_PI/6*5)*radio);
	hex.vertex(-sin(TWO_PI/6*6)*radio , -cos(TWO_PI/6*6)*radio);
	hex.endShape(CLOSE);

	shape(hex, x, y);
}	