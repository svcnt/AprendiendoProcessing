 /* 

Aprendiendo Processing - Ejemplo 06

- 

José Vicente Araújo
http://dunadigital.com 
svcnt@dunadigital.com
junio 2015
Processing 2.2.1

*/


//LIBRERÍAS

//VARIABLES GLOBALES
//Distancia entre puntos origen = tamaño
int dist = 50;
//Banco de imágenes
String[] tiles = { "01.svg", "02.svg", "03.svg", "04.svg", "05.svg", "06.svg", "07.svg" };
//Paleta de colores
color[] paleta = { #C74029, #FAE8CD, #128085, #385052, #F0AD44};
//Escalas de ampliación
int[] escala = {1, 2, 4};

//SETUP
void setup() {
  size(500, 500);
  background(#202020);
  noFill();
  noStroke();
  //shapeMode(CENTER);
  frameRate(0.5);
}


//LOOP
void draw(){
	background(#202020);

	//Generador de mosaicos

	//Repetir 2 veces
	for (int n = 0; n < 2; ++n) {
		//columnas
		for (int i = 0; i < width; i+=dist) {
			//filas
			for (int ii = 0; ii < height; ii+=dist) {
				//Toma un color aleatorio de la Paleta
				fill(paleta[int(random (paleta.length))]);
				//Crea objeto PShape
				PShape tile;
				//Le asigna una imagen
				tile = loadShape(
						tiles[int(random (tiles.length))]
					);
				//Eliminainformación de estilo
				tile.disableStyle();
				
				//Dibuja cada elemento:

				//Posición
				translate(i, ii);
				//Giro
				rotate(int(random(4))*HALF_PI);
				//Escala *1, *2 o *4 aleatoriamente
				int sz = escala[int(random(2))];
				//Dibuja la tesela
				shape(tile, 0, 0, dist*sz, dist*sz);
				resetMatrix();
			}
		}
	}
	
}