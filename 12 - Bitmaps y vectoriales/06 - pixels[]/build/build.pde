/* 

Aprendiendo Processing - pixels[]

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//importamos una imagen

PImage img;
float bri;


void setup() {
  img = loadImage("../../../data/img.jpg");
  size(img.width, img.height);
  image(img, 0, 0);
  //cargamos todos sus píxeles
  loadPixels();
}

void draw() {
  for (int i = 0; i < pixels.length; i++) {
    //leemos el valor de los canales rojo, verde y azul de cada uno
    float bri_ = brightness(pixels[i]);
    if (bri_ < 127) {
      bri = 0;
    } else { bri = 255;}
    //asignamos esos mismos valores a cada píxel
    pixels[i] = color(bri);
    //actualizamos
    updatePixels();
  }
  
  noLoop();
}