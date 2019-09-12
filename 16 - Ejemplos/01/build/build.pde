/* 

Aprendiendo Processing - Ejemplo 01

- Carga una imagen y dibuja una nube de puntos aleatorios que toman el color de ella

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//crea obj imagen
PImage img;
//número de puntos
int cantidad = 500;
//ARRAYS
float[] x = new float[cantidad];
float[] y = new float[cantidad];
float[] i = new float [cantidad];
color[] c = new color [cantidad];

void setup() {
  img = loadImage("../../../data/rubens.jpg");
  size(img.width, img.height);
  stroke(50,50);
  //noStroke();
  smooth();
  
}

void draw(){
	pinta();
}

void pinta(){
	for (int n = 0; n < cantidad; n++) {
	    x[n] = int(random(width));
	    y[n] = int(random(height));
	    i[n] = random(10);
	    c[n] = img.get(int(x[n]), int(y[n]));

	    fill(c[n]);
	    ellipse(x[n], y[n], i[n], i[n]);
	}
}