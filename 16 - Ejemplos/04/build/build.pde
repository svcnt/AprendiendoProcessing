/* 

Aprendiendo Processing - Ejemplo 02

- Carga una imagen y dibuja una nube de puntos aleatorios que toman el color de ella

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//LIBRERÍAS
import processing.video.*;
//VARIABLES GLOBALES
int num = 35;
float gap, alto, lado;
//crear obj Movie
Movie clip01;

void setup() {
  size(640, 480);
  background(#202020);
  stroke(50,50);
  //noStroke();
  smooth();
  //cargar vídeo
  clip01 = new Movie(this, "../../../../data/clip.mp4");
  //reiniciar al acabar
  clip01.loop();
  //reproducir una vez
  //clip01.play();
  clip01.speed(1);
  clip01.frameRate(24);
  
}

void draw(){
	grid();
}

// refrescar
void movieEvent(Movie m) {
  m.read();
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

}

void triangulo(float x, float y, float radio){

	float correct = TWO_PI/12;

	fill(clip01.get(int(x), int(y)));

	triangle(
		x + cos(TWO_PI/3 + correct)*radio,
		y + sin(TWO_PI/3 + correct)*radio,
		x + cos(TWO_PI/3*2 + correct)*radio,
		y + sin(TWO_PI/3*2 + correct)*radio,
		x + cos(TWO_PI/3*3 + correct)*radio,
		y + sin(TWO_PI/3*3 + correct)*radio
	);

	fill(clip01.get(int(x), int(radio+y)));

	triangle(
		x + cos(TWO_PI/3 - correct)*radio,
		radio + y + sin(TWO_PI/3 - correct)*radio,
		x + cos(TWO_PI/3*2 - correct)*radio,
		radio + y + sin(TWO_PI/3*2 - correct)*radio,
		x + cos(TWO_PI/3*3 - correct)*radio,
		radio + y + sin(TWO_PI/3*3 - correct)*radio
	);
}	