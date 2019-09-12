/* 

Aprendiendo Processing - Movie

- Clic para parar, soltar para continuar

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


void setup() {
  size(480, 360);
  background(#202020);
  //cargar vídeo
  clip01 = new Movie(this, "../../../../data/clip.mp4");
  //reiniciar al acabar
  clip01.loop();
  //reproducir una vez
  //clip01.play();
  clip01.speed(1);
  clip01.frameRate(24);
}

void draw() {
  //tint(255, 20);
  //video, coords, tamaño
  image(clip01, 0, 0, width, height);
  text(clip01.time(), 20, 20);
}

// refrescar
void movieEvent(Movie m) {
  m.read();
}

void mousePressed() {
  clip01.pause();
}

void mouseReleased() {
  clip01.play();
  println(clip01.duration());
}

