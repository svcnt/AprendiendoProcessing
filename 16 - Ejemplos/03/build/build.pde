/* 

Aprendiendo Processing - Ejemplo 01

- Carga una imagen y dibuja una nube de puntos aleatorios que toman el color de ella

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//LIBRERÍAS
import processing.video.*;
//VARIABLES
//crear obj Movie
Movie clip01;
//número de puntos
int cantidad = 1000;
//ARRAYS
float[] x = new float[cantidad];
float[] y = new float[cantidad];
float[] i = new float [cantidad];
color[] c = new color [cantidad];

void setup() {
  size(640, 480);
  //stroke(50,50);
  noStroke();
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
	pinta();
}

// refrescar
void movieEvent(Movie m) {
  m.read();
}

void pinta(){
	for (int n = 0; n < cantidad; n++) {
	    x[n] = int(random(width));
	    y[n] = int(random(height));
	    i[n] = random(10);
	    c[n] = clip01.get(int(x[n]), int(y[n]));

	    fill(c[n], 25);
	    ellipse(x[n], y[n], i[n], i[n]);
	}
}

