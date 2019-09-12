/* 

Aprendiendo Processing - Red triangular

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
int num = 8;
float gap, alto, lado;

//SETUP
void setup() {
	size(400, 400);
	background(#202020);
	stroke(255);
	strokeWeight(3);
}

//LOOP
void draw() {

	translate((width/num)/3 , 0);

	for (int i = 1; i < num; ++i) {
		for (int ii = 1; ii < num; ++ii) {
			gap = width/num;
			lado = gap;
			alto = sqrt(3)*gap;
			point(i*lado, ii*alto);
			point(i*lado - lado/2, ii*alto - alto/2);
		}

	}

}	