/* 

Aprendiendo Processing - pixels[]

- Clic para cambiar el patrón

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//VARIABLES GLOBALES
int contador = 0;

float h = 0;
float s = 0;
float b = 0;

void setup() {

  size(500, 400);
  colorMode(HSB);

}

     
void draw() {

  loadPixels();

  for (int i = 0; i < pixels.length; i++) {
    //el valor de cada variable es menor al principio y mayor al final

    switch(contador){
      default:
        h = int(random(i/500));
        s = int(random(i/500));
        b = int(random(i/500));
        pixels[i] = color(h, s, b);
      break;

      case 1:
        h = int(sin(frameCount*0.5*i)*255);
        s = int(sin(frameCount*0.4*i)*255);
        b = int(sin(frameCount*0.3*i)*255);
        pixels[i] = color(h, s, b);
      break;

       case 2:
        contador = 0;
      break;


    }
    

  }

  updatePixels();

}

void mouseReleased() {
  contador++;
}