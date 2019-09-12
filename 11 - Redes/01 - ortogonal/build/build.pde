/* 

Aprendiendo Processing - Red ortogonal

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//VARIABLES GLOBALES
int num = 10;

//SETUP
void setup() {
	size(400, 400);
	background(#202020);
	stroke(255);
	strokeWeight(3);
}

//LOOP
void draw() {
	for (int i = 1; i < num; ++i) {
		for (int ii = 1; ii < num; ++ii) {
			float gap = width/num;
			point(i*gap, ii*gap);
		}
		
	}
	
}