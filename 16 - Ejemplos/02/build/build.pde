/* 

Aprendiendo Processing - Ejemplo 02

- Carga una imagen y dibuja una nube de puntos aleatorios que toman el color de ella

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//VARIABLES GLOBALES
int num = 25;
float gap, alto, lado;
//crea obj imagen
PImage img;

void setup() {
  img = loadImage("../../../data/rubens.jpg");
  size(img.width, img.height);
  background(#202020);
  stroke(50,50);
  //noStroke();
  smooth();
  
}

void draw(){
	grid();
}

void grid(){
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

	fill(img.get(int(x), int(y)));

	triangle(
		x + cos(TWO_PI/3 + correct)*radio,
		y + sin(TWO_PI/3 + correct)*radio,
		x + cos(TWO_PI/3*2 + correct)*radio,
		y + sin(TWO_PI/3*2 + correct)*radio,
		x + cos(TWO_PI/3*3 + correct)*radio,
		y + sin(TWO_PI/3*3 + correct)*radio
	);

	fill(img.get(int(x), int(radio+y)));

	triangle(
		x + cos(TWO_PI/3 - correct)*radio,
		radio + y + sin(TWO_PI/3 - correct)*radio,
		x + cos(TWO_PI/3*2 - correct)*radio,
		radio + y + sin(TWO_PI/3*2 - correct)*radio,
		x + cos(TWO_PI/3*3 - correct)*radio,
		radio + y + sin(TWO_PI/3*3 - correct)*radio
	);
}	