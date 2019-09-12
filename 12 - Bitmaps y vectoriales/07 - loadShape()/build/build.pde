/* 

Aprendiendo Processing - loadShape()

- Carga una imagen vectorial en formato SVG

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/

//crea objetos PShape para la imagen y para cada una de sus capas
PShape vec, capa1, capa2, capa3, capa4;
//paleta de colores
color[] paleta = { #C74029, #FAE8CD, #128085, #385052, #F0AD44};


void setup() {
  size(400, 400);
  background(#202020);
  //carga el archivo vectorial
  vec = loadShape("../../../data/vec.svg");
  //'count' = número de capas en 'vec'
  int count = vec.getChildCount();
  println(count);
  //carga cada capa de 'vec' en un objeto PShape distinto
  capa1 = vec.getChild(0);
  //y elimina su información de estilo (trazo, relleno...)
  capa1.disableStyle();

  capa2 = vec.getChild(1);
  capa2.disableStyle();

  capa3 = vec.getChild(2);
  capa3.disableStyle();

  capa4 = vec.getChild(3);
  capa4.disableStyle();

  noStroke();
  stroke(#202020);

  //toma un color de la paleta
  fill(paleta[int(random (paleta.length))]);
  //dibuja una capa del archivo vectorial
  shape(capa1, 0, 0);

  fill(paleta[int(random (paleta.length))]);
  shape(capa2, 0, 0);

  fill(paleta[int(random (paleta.length))]);
  shape(capa3, 0, 0);

  fill(paleta[int(random (paleta.length))]);
  shape(capa4, 0, 0);
}

void draw() {
  

  noLoop();

}