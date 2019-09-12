/* Set de pruebas para VJing */
/* Crear pantallas (polígonos) moldeables para mapping */
/* Polígonos manipulables vía mouse */
/* Crear las pantallas mediante clases */



//LIBRARIES/////////////

//Vídeo
import processing.video.*;



//VARIABLES/////////////

//Texturas para los polígonos
//(o 'projections' para las 'screens')

//Imágenes generadas con Processing
PGraphics pr01;

//Imagen fija
PImage pr02;

//Vídeo
Movie pr03;

//Tamaño de la ventana
int ancho = 600;
int alto = 600;

//Vértices
//Cada screen define los vértices a partir de las coordenadas del centro
//Screen 01
PVector c1 = new PVector(ancho*0.175, alto*0.5);
PVector s1v1 = new PVector(c1.x-87.5, c1.y-285);
PVector s1v2 = new PVector(c1.x+87.5, c1.y-285);
PVector s1v3 = new PVector(c1.x+87.5, c1.y+285);
PVector s1v4 = new PVector(c1.x-87.5, c1.y+285);
//Screen 02
PVector c2 = new PVector(ancho*0.5, alto*0.5);
PVector s2v1 = new PVector(c2.x-87.5, c2.y-285);
PVector s2v2 = new PVector(c2.x+87.5, c2.y-285);
PVector s2v3 = new PVector(c2.x+87.5, c2.y+285);
PVector s2v4 = new PVector(c2.x-87.5, c2.y+285);
//Screen 03
PVector c3 = new PVector(ancho*0.825, alto*0.5);
PVector s3v1 = new PVector(c3.x-87.5, c3.y-285);
PVector s3v2 = new PVector(c3.x+87.5, c3.y-285);
PVector s3v3 = new PVector(c3.x+87.5, c3.y+285);
PVector s3v4 = new PVector(c3.x-87.5, c3.y+285);

//Screens
Screen scr01, scr02, scr03;


//ESTRUCTURA///////////////////

void setup(){
  size(600, 600, P2D);
  background(0);
  stroke(100);
  //Texturas
  pr02 = loadImage("tex1.jpg");
  pr03 = new Movie(this, "static_1.mp4");
  pr03.loop();
  pr01 = createGraphics(1270/3,710);
  //Ajustes para las texturas
  textureMode(NORMAL); //NORMAL o IMAGE
  textureWrap(REPEAT); //CLAMP o REPEAT
  
}




void draw(){
	background(0);
	textura();
	//Instancias de la clase Screen
  //Variables: 4 vectores (esquinas) y textura
	scr01 = new Screen(s1v1,s1v2,s1v3,s1v4,pr01);
  //scr01.display();
  scr02 = new Screen(s2v1,s2v2,s2v3,s2v4,pr02);
  //scr02.display();
  scr03 = new Screen(s3v1,s3v2,s3v3,s3v4,pr03);
  //scr03.display();
}




//Mover vértices
void mouseDragged(){
  scr01.mouseDragged();
  scr02.mouseDragged();
  scr03.mouseDragged();
}


//Actualizar imagen de vídeo
void movieEvent(Movie m) {
  m.read();
}



